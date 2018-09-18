import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash set.
		HashSet<String> hs = new HashSet<String>();
		// Add elements to the hash set.
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println("HashSet: "+hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("B");
		lhs.add("A");
		lhs.add("D");
		lhs.add("E");
		lhs.add("C");
		lhs.add("F");
		System.out.println("LinkedHashSet: "+lhs);
		
		//
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println("TreeSet: "+ts);
		
	}

}
