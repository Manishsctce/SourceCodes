package collectionDemo;

import java.util.*;
/* ITERATOR example
 * iterating arraylist
 */
public class IteratorDemo_DifferentWaysToIterateArrayList {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		 
		// add 4 different values to list
		arrayList.add("eBay");arrayList.add("Paypal"); arrayList.add("Google");arrayList.add("Yahoo");
		arrayList.add(1);

		//1a. iterate via "for loop"
		System.out.println("****Using for loop ****");
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		//1b.
		System.out.println("****Using for loop and iterator****");
		for(Iterator itr = arrayList.iterator();itr.hasNext();){
			System.out.println(itr.next());
		}
	
		
		//2. Using Advance for loop
		System.out.println("\n==> Advance For Loop Example..");
		for (Object temp : arrayList) {
			System.out.println(temp);
		}
		
		
		
		//3. Using iterator
		System.out.println("****Using while loop and iterator****");
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
