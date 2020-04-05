package collectionDemo;
// List<?> is List of unknown type while 
// List<Object> is essentially List of any Type.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList(10);
		//ArrayList<?> a1 = new ArrayList(10);
		a1.add(1);a1.add(2);a1.add(3);a1.add(4);
		a1.add(10);a1.add("Hello");a1.add(10.1);a1.add(10001);
		
		a1.add(0, 0);

		ArrayList<String> strList = new ArrayList();
		strList.add("Manish");strList.add("Manish2");strList.add("Manish3");
		
		a1.add(strList);
		
		Object obj = new Object();
		
		ArrayList<?> a2 = new ArrayList();
		//a2.add(a1);
		//a2.add(obj); 
		//a2.add(new String("Manish"));
		
		a2.add(null);
		
		//Added in 1.8
		a1.forEach(a -> System.out.println("FE:"+a));
		
		DisplayCollection.displayInLine(a1);
		System.out.println("Size : "+a1.size()+":");
		
		
		System.out.println("---------using Iterator--------");
		Iterator itr = a1.iterator();
		while(itr.hasNext()){
			Object o = itr.next();
			if(o.toString().equals(Integer.toString(10)))
				itr.remove();
			else
				System.out.println(o);						
		}
		System.out.println(itr.hasNext());
	}

}
