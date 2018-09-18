package collectionDemo;
/* classes of LIST - ArrayList,Vector and LinkedList
 * ArrayList maintain insertion order
 */
import java.util.*;
class ListClassesDemo1 {
	public static void main(String args[]) {
		 
		//1. Create an ARRAY LIST
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println("InitiarrayList size of arrayList: " +arrayList.size());
		// Add elements to the array list.
		arrayList.add("C");arrayList.add("A");arrayList.add("E");arrayList.add("B");arrayList.add("D");arrayList.add("F");
		
		
		arrayList.add(1, "A2");
		System.out.println("Size of arrayList after additions: " +arrayList.size());
		// Display the array list.
		System.out.println("Contents of arrayList: " + arrayList);
		
		// Remove elements from the array list.
		arrayList.remove("F");
		arrayList.remove(2);
		System.out.println("Size of arrayList after deletions: " +arrayList.size());
		System.out.println("Contents of arrayList: " + arrayList);
		
		String strArr[] = new String[arrayList.size()];
		//converting into array
		strArr = arrayList.toArray(strArr);
		for(String s:strArr)
			System.out.println(s);
//--------------------------------------------------------//
//vecoto allow duplicate, insertion order		
		List vectorList = new Vector();
		vectorList.add("1");vectorList.add("1");vectorList.add("2");vectorList.add("0");
		System.out.println("Contents of Vector List: " + vectorList);
		System.out.println(vectorList.get(3));
//--------------------------------------------------------//
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("OriginarrayList contents of ll: " + ll);
		// Remove elements from the linked list.
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "
				+ ll);
		// Remove first and last elements.
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "
				+ ll);
		// Get and set a varrayListue.
		String varrayList = ll.get(2);
		ll.set(2, varrayList + " Changed");
		System.out.println("ll after change: " + ll);
		
			
	}
}