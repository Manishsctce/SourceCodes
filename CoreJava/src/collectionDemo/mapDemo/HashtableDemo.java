package collectionDemo.mapDemo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/* HASHTABLE
 * 
 * it does not allow null key and value
 * for duplicate key values get overwrite
 */

public class HashtableDemo {
	static Hashtable companies ;
	public static void main(String args[]) {
		
		companies = new Hashtable();
		companies.put("Google", "United States");companies.put("Nokia", "Finland");
		companies.put("Sony", "Japan");
		companies.put("Sony", "Japan2");
		
		//companies.put(null,null); //throw NullPointerException at runtime
		
		companies.get("Google");
		
		demo4();
		//demo2();
		//demo3();
	}
	
	//Cannot insert Null key
	public static void demo1(){	
		try{			
			companies.put(null, "Japan");
		}
		catch(Exception e){
			System.out.println("##HashMap cannot insert null Key: "+e.getMessage());			
		}
	}
	
	//Cannot insert Null value	
	public static void demo2(){	
		try{			
			companies.put("intel", null);
		}
		catch(Exception e){
			System.out.println("##HashMap cannot insert null value: "+e.getMessage());			
		}
	}
	
	//No Order
		static void demo4(){
			Hashtable<Object, Object> hm = new Hashtable();
			hm.put(10, "hey1");
			hm.put(11, "hey2");
			hm.put(12, "hey2");
			hm.put(13, "hey3");
			hm.put(14, "hey4");
			hm.put(15, "hey2");
			hm.put(16, "hey2");
			hm.put(17, "hey3");
			hm.put(18, "hey4");
			
			DisplayMap.display(hm);
		}

	//methods 
	public static void demo3(){
		System.out.println("Does hashtable contains Google as key: "+ companies.containsKey("Google"));
		System.out.println("Does hashtable contains Japan as value: "+ companies.containsValue("Japan"));
		System.out.println("Is companies hashtable empty: "+ companies.isEmpty());
		System.out.println("Size of hashtable in Java: " + companies.size());
		
		Set set = companies.keySet();
		for(Object o : set)
			System.out.println(o);
		
		
		Enumeration e = companies.elements();
		while(e.hasMoreElements())
			System.out.println("Enum: "+e.nextElement());
		
		Enumeration e2 = companies.keys();
		while(e2.hasMoreElements())
			System.out.println("Enum: "+e2.nextElement());
		companies.clear();
	}
}
