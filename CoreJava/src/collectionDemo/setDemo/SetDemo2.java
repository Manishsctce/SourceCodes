package collectionDemo.setDemo;
import java.util.*;
/* SORTED SET METHODS
 * 1. SortedSet<E> subSet(E fromElement,E toElement)
Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive. (If fromElement and toElement are equal, the returned set is empty.)
 The returned set is backed by this set, so changes in the returned set are reflected in this set, and vice-versa. The returned set supports all optional set operations that this set supports.
  
 * 2. headSet(E toElement)- Returns a view of the portion of this set whose elements are strictly less than toElement
 * 3. SortedSet<E> tailSet(E fromElement) - Returns a view of the portion of this set whose elements are greater than or equal to fromElement
 * 4. first()
 * 5. last()
 * 
 */
public class SetDemo2 {
	public static void main(String[] args) {
		SortedSet<Integer> treeSet1 = new TreeSet();
		SortedSet treeSet2 = new TreeSet<Integer>();
		//treeSet.last();
		
		treeSet1.add(-17);treeSet1.add(-16);treeSet1.add(-14);
		treeSet1.add(4);treeSet1.add(3);treeSet1.add(2);treeSet1.add(1);treeSet1.add(0);
		//treeSet1.add("hhh");
		DisplayCollection.display(treeSet1);
		
		SortedSet<Integer> headset1 = treeSet1.headSet(2);
		headset1.add(8);
		System.out.println("*****using headSet****");
		DisplayCollection.display(headset1);
		System.out.println("******using subSet******");
		SortedSet subset = treeSet1.subSet(0, 9);
		
		subset.add(4);
		DisplayCollection.display(subset);
		System.out.println("Test");
	}


}
