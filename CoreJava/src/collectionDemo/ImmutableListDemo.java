package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>(10);
		a1.add(1);a1.add(2);a1.add(3);a1.add(4);
		
		System.out.println(a1);
		
		 //List<ArrayList<Integer>> sl = Collections.singletonList(a1);
		
		List<Integer> uml = Collections.unmodifiableList(a1);
		
		uml.add(5);
		System.out.println("UML "+uml);
		
	}

}
