package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo_usingRemove {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		 
		// add 4 different values to list
		arrayList.add("eBay");arrayList.add("Paypal"); arrayList.add("Google");arrayList.add("Yahoo");
		arrayList.add(1);
		int i=0;
		System.out.println("****Using while loop and iterator****");
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Object obj = iterator.next();			
			//Object obj = iterator.next();
			if(obj.equals(1)){
				iterator.remove();
				arrayList.add("new");
			}
			else
				System.out.println(obj);			
		}
		
		
	}
}
