package collectionDemo.mapDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable<String,String> companies = new Hashtable<String,String>();


		// Java Hashtable example to put object into Hashtable
		// put(key, value) is used to insert object into map
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");
		companies.put("Sony", "Japan");
		//companies.put(null, "Japan");		
		companies.put("Sony", "Japan");//it will over write
		//companies.put("Micromax", null);//throw NullPointerException
		
		String key1 = "Sony";
		String key2 = null;
		System.out.println("Value of Key"+ key1 +" is "+companies.get(key1));;
		//System.out.println("Value of Key"+ key2 +" is "+companies.get(key2));;
		
		System.out.println("Contains "+key2+" key: "+companies.containsKey(key2));
		
		Set<Map.Entry<String,String>> set = companies.entrySet();
		Iterator<Map.Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry<String,String> mapentry = itr.next();
			System.out.println(mapentry.getKey() +" "+ mapentry.getValue());
		}
	}

}
