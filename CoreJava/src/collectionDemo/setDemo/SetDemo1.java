package collectionDemo.setDemo;
/* SET INTERFACE - SortedSet
 * classes - HashSet,TreeSet, LinkedHashSet
 * HashSet - no duplicate, allow 1 null element, no iteration order, different datatype, constant time performance for basic operation
 * TreeSet - No duplicate,No null element , Elements are sorted in ascending element order, only 1 datatype allowed, all operation O(log n)
 * LinkedHashSet -No dupl, 1null element, Elements are in inserted order,different datatype and doubly linked list maintain
 */
import java.util.*;
public class SetDemo1{
	public static void main(String[] args){
		Set hashset = new HashSet();
		SortedSet<Integer> treeSet = null;
		hashset.add("Peeyush");hashset.add("Dineesh"); hashset.add("Rakshith");
		hashset.add("Rakshith");//Duplicate
		hashset.add(null);
		hashset.add(null);
		hashset.add("Manish");hashset.add(1.334);hashset.add(9877323842L);
		//hashset.add();
		
		System.out.println("HashSet :");
		//No duplicate elements and No guarantee on the order of elements
		display1(hashset);
	
		
		System.out.println("\n**********************TreeSet****************************");
		Set treeset = new TreeSet();
		treeset.add("Peeyush"); treeset.add("Dineesh"); treeset.add("Rakshith");treeset.add("Rakshith");
		//treeset.add(null);//NullPointerException at RunTime
		treeset.add("Manish");treeset.add("Priya");treeset.add("PRIYA");
		//treeset.add(1.4343);//ClassCastException
				
		//No null element, Elements are sorted in ascending element order
		display1(treeset);
		
/*		System.out.println("After Removing duplicate");		
		for(Iterator itr = treeset.iterator();itr.hasNext();){
			
			//itr.remove();
		}*/
		
		System.out.println("\n******************LinkedHashSet******************");
		//Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Peeyush"); linkedHashSet.add("Dineesh"); linkedHashSet.add("Rakshith");
		//linkedHashSet.add(null);linkedHashSet.add(null);
		linkedHashSet.add(1.324);linkedHashSet.add(9999);
		linkedHashSet.add(-1.824);linkedHashSet.add(99999);
		
	
		//Elements are in inserted order and doubly linked list maintain
		display1(linkedHashSet);
		System.out.println();
		Double temp,sum=0.0;
		
		for (Iterator it = linkedHashSet.iterator(); it.hasNext();){
			Object obj = it.next();
			//System.out.println(obj +" : "+ obj.getClass().toString());
			if(obj.getClass().toString().contains("Double")){
				temp = (Double)obj;
				sum = temp + sum;
			}
		}
		System.out.println("Sum "+sum);
	}	
	
	public static void display1(Collection c){
		Iterator itr = c.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
	
	/*for (Iterator it = hashset.iterator();it.hasNext();)
		System.out.print(it.next()+"  ");*/
	
}
