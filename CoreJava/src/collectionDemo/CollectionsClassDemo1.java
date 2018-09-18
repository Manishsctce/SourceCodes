package collectionDemo;
/*	Collections unmodifiable method not make collection unmodifiable if we not assign unmodified coll back 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;//Class
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class CollectionsClassDemo1 {

	public static void main(String[] args) {
		
		List godList = Arrays.asList(new String[] { "Donald", "Dennis", "Ken" });
		List<String> arrayList = new ArrayList<String>(godList);
		
		for(Iterator itr = arrayList.iterator();itr.hasNext();)
			System.out.println(itr.next());
		Collections.unmodifiableList(arrayList);
		
		arrayList.add("Manish");
		System.out.println("****************After Modification**************************");
		for(Iterator itr = arrayList.iterator();itr.hasNext();)
			System.out.println(itr.next());
		
		System.out.println("After Collections.unmodifiableList() list get modified above. Now check");
		arrayList = Collections.unmodifiableList(arrayList);
		//arrayList.add("Gaurav");//UnsupportedOperationException
		for(Iterator itr = arrayList.iterator();itr.hasNext();)
			System.out.println(itr.next());
		
	}

}
