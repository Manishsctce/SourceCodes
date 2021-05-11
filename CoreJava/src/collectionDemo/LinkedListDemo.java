package collectionDemo;
import java.util.*;
// Demonstrate LinkedList.
/*LinkedList class implements Set, List, Queue
 */

class LinkedListDemo {
	public static void main(String args[]) {

		displayOnlyString();
	}
	
	
	public static void displayOnlyString() {
		List<Object> list = new LinkedList<>();
		list.add(1);list.add(2);list.add(3);
		list.add("one");list.add("two");list.add("three");
		
		list.forEach(e -> {
			if(e instanceof Integer)
				System.out.println(e);
		});
		list.forEach(e -> {
			if(e instanceof String)
				System.out.println(e);
		});
	}
	
	public static void linkedBasedOperation() {
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements to the linked list.
		ll.add("F");ll.add("B");ll.add("D");ll.add("E");ll.add("C");ll.addLast("Z");ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		// Remove elements from the linked list.
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "+ ll);
		// Remove first and last elements.
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "+ ll);
		
		
		// Get and set a value.
		String val = ll.get(2);
		ll.set(2, val + " Changed");
		System.out.println("ll after change: " + ll);
		
	}
}