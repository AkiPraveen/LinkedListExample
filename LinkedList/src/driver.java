import java.util.Arrays;

public class driver {
	public static void main(String[] args) {
		System.out.println("LinkedList Demo:");
		
		LinkedList<String> l = new LinkedList<>();
		LinkedList<String> e = new LinkedList<>();
		
		l.add("STAND UP");
		l.add("SPITFIRE");
		l.add("STAND UP");
		l.add("VOODOO PEOPLE");
		l.add("HOTRIDE");
		
		
		System.out.println(l.getFrequencyOf("STAND UP"));
		System.out.println(l.getFrequencyOf("PIRANHA"));
		System.out.println(l.getFrequencyOf("SPITFIRE"));
		
		System.out.println(l.contains("STAND UP"));
		System.out.println(l.contains("PIRANHA"));
		
		
		System.out.println(l.getNumNodes());
		System.out.println(Arrays.toString(l.toArray()));
		
		l.remove("HOTRIDE");
		
		System.out.println(l.getNumNodes());
		System.out.println(Arrays.toString(l.toArray()));
		
		l.remove("STAND UP");
		System.out.println(Arrays.toString(l.toArray()));
		
		System.out.println(l.getNumNodes());
		
		l.clear();
		System.out.println(Arrays.toString(l.toArray()) + "!");
		
		// The following line will result in a nullPointerException
		// System.out.println(e.remove());
	}
}
