package collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseIterateDemo1 {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		 
		// add 4 different values to list
		arrayList.add("eBay");arrayList.add("Paypal"); arrayList.add("Google");arrayList.add("Yahoo");
		arrayList.add(1);

		//1a. iterate via "for loop"
		System.out.println("****Using for loop ****");
		for(int i=arrayList.size()-1;i>=0;i--){
			System.out.println(arrayList.get(i));
		}
		
		LinkedList ll = new LinkedList();
		ll.add("eBay");ll.add("Paypal"); ll.add("Google");ll.add("Yahoo");
		ll.add(1);
		
		ll.r
	}

}
