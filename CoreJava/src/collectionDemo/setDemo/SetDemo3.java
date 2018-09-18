package collectionDemo.setDemo;
import java.util.*;
/* NAVIGABLE SET DEMO
 * TreeSet is only Navigable
 * E lower(E e) - Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
 * E higher(E e) - Returns the least element in this set strictly greater than the given element, or null if there is no such element.
 * E ceiling(E e) - Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
 * E floor(E e) - Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
 * E pollFirst() - Retrieves and removes the first (lowest) element, or returns null if this set is empty.
 * E pollLast() - Retrieves and removes the last (highest) element, or returns null if this set is empty.
 * NavigableSet<E> descendingSet() - Returns a reverse order view of the elements contained in this set.
 */

public class SetDemo3 {

	public static void main(String[] args) {
		//NavigableSet navigableset = new HashSet();
		NavigableSet navigableSet = new TreeSet();
		navigableSet.add(1);navigableSet.add(98);navigableSet.add(4);navigableSet.add(99);navigableSet.add(97);
		navigableSet.add(-12);navigableSet.add(24);
		System.out.println("*****Navigable set*****");
		DisplayCollection.displayInLine(navigableSet);
		System.out.println("\n************Navigable Set Methods********************");
		System.out.println("Ceiling of 95(i.e. greater or equal): "+navigableSet.ceiling(95));//97
		System.out.println("Floor of 95(i.e lower or equal to E): "+navigableSet.floor(95));//4
		System.out.println("Lower of 98(i.e lower)" + navigableSet.lower(98));//97
		System.out.println("Higher of 98(i.e higher than e): "+navigableSet.higher(98));//99
		
		System.out.println("\n*****Navigable set after pollfirst*****");
		navigableSet.pollFirst();
		DisplayCollection.displayInLine(navigableSet);
		
		System.out.println("\n*****Navigable set after reversing*********");
		navigableSet = navigableSet.descendingSet();
		DisplayCollection.displayInLine(navigableSet);
		System.out.println("\n\n");
		   System.out.format("%d %d %d %d",
			        navigableSet.floor(-12),
			        navigableSet.floor(0),
			        navigableSet.floor(24),
			        navigableSet.floor(100)
			    );
	}

}
