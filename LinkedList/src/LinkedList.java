/*
 * OCT 2018
 * AKILESH PRAVEEN
 * LinkedList implementation
 */


public class LinkedList<T> {

	private Node head;
	private int numNodes;

	/*
	 * add method - pseudo code: 1. Create a new node 2. Link this node to head 3.
	 * Reassign head to this new node
	 */
	public void add(T newData) {

		// Connect this new node to the current head
		Node newNode = new Node(newData);
		newNode.next = head;

		// Reassign head
		head = newNode;
		numNodes++;
	}

	/*
	 * toArray method
	 */
	public T[] toArray() {

		// suppress warnings for cast
		@SuppressWarnings("unchecked")

		T[] myArray = (T[]) (new Object[numNodes]);
		System.out.println("I think there are " + numNodes);

		int arrayIndex = 0;
		Node currNode = head;

		while (currNode != null) {
			myArray[arrayIndex] = currNode.data;
			arrayIndex++;
			currNode = currNode.next;
		}

		return myArray;
	}

	/*
	 * getFrequencyOf method
	 */
	public int getFrequencyOf(T checkData) {
		int count = 0;
		Node currNode = head;

		while (currNode != null) {

			// check to see if it's a match
			if ((currNode.data).equals(checkData)) {
				count++;
			}

			// move forward
			currNode = currNode.next;
		}

		return count;
	}

	/*
	 * contains method
	 */
	public boolean contains(T checkData) {
		// start at head
		Node currNode = head;

		while (currNode != null) {

			// check to see if it's a match
			if ((currNode.data).equals(checkData)) {
				return true;

			}

			// move forward
			currNode = currNode.next;
		}

		return false;

	}
	
	/*
	 * clear method to remove all elements of list
	 */
	public void clear() {
		while (head != null) {
			remove();
		}
	}
	
	/*
	 * simple isEmpty check
	 */
	public boolean isEmpty() {
		return (head.data != null);
	}

	/*
	 * remove method to remove from the 'head' position of the linkedlist
	 * 
	 * Will return null object if the target list is empty.
	 */
	public void remove() {
		
		head = head.next;
		numNodes--;

	}

	/*
	 * Removing the first occurrence of an entry
	 */
	public void remove(T checkData) {
		
		Node swap = getReferenceTo(checkData);
		
		if (swap != null) {
			
			swap.data = head.data;
			
			remove();	
		}
	}

	/*
	 * Getting the reference to the first occurrence of an entry. Analogous to
	 * .indexOf() for Array data structure.
	 * 
	 * @return reference to first occurrence if found, null if not found
	 * 
	 */
	public Node getReferenceTo(T checkData) {
		Node currNode = head;

		while (currNode != null) {

			// if it is found, break the loop
			if ((currNode.data).equals(checkData)) {
				return (currNode);
			}

			// not found- continue loop
			currNode = currNode.next;
		}

		return null;
	}

	// Getters
	public int getNumNodes() {
		return numNodes;
	}

	private class Node {
		private T data;
		private Node next;

		// constructor to create tail end of list
		private Node(T data) {
			this(data, null);
		}

		// basic constructor
		private Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
}
