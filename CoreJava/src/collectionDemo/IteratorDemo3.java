package collectionDemo;
import java.util.*;
/* SET ITERATION
 * 
 */
public class IteratorDemo3 {
	public static void main(String[] args) {
		System.out.println("Hash Set");
		Set hashSet = new HashSet();		
		hashSet.add(1);hashSet.add("Manish");hashSet.add(1.334);hashSet.add(null);		
		DisplayCollection.display(hashSet);
		
		System.out.println("TreeSet Iteration");
		SortedSet sortedSet = new TreeSet();
		sortedSet.add(1);
		//sortedSet.add("Manish");
		sortedSet.add(1.8723);
		sortedSet.add(null);
		DisplayCollection.display(sortedSet);
		
		
	}

}
 