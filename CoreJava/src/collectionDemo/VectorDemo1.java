package collectionDemo;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.setSize(4);
		System.out.println(v.size());
		
		v.add("Hello1");v.add("Hello2");v.add("Hell03");
		v.add("Hello4");
		v.add("Hello5");
		v.add("Hello6");
		v.add("Hello7");
		v.add("Hello8");
		v.add("Hello9");
		
		for(Object o : v)System.out.println(o);
		System.out.println(v.size());
		v.setSize(15);
		
		
		v.setSize(15);
		System.out.println(v.size());
		for(Object o : v)
			System.out.println(o);

	}

}
