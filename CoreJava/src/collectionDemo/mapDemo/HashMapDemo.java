package collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*HashMap is not synchronized 
 * It permit 1 NULL key and many null values
 * if duplicate key found then value overwrite
 * No duplicate key-value pair
 * */

public class HashMapDemo {
	public static void main(String[] args) {
		
		/*Set<Map.Entry<String,Integer>> set = hashmap.entrySet();
		Iterator<Map.Entry<String,Integer>> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> mapentry = itr.next();
			System.out.println(mapentry.getKey() +" "+ mapentry.getValue());
		}*/
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		Map<String,Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		Map<String,Integer> treeMap = new TreeMap<>();
		
		demo1("HashMap",hashmap);
		demo1("LinkedHashMap", linkedHashMap);
		//demo1("TreeMap", treeMap);//throw NPE 
		NoDuplicateKeyValuePair("HashMap", hashmap);
		//demo3();
	}
	
	//It permit 1 NULL key and many null values
	//if duplicate key found then value overwrite
	static void demo1(String typeOfMap, Map<String,Integer> map){		
		map.put("A", 54);		
		map.put("B", 65);
		Integer ret = map.put("A", 55);		
		map.put(null, 89);
		map.put(null, null);
		map.put(null, 99);
		map.put("C", 69);
		map.put("B", 69);
		System.out.println("######## "+typeOfMap +" ###########");
		System.out.println("Return value:"+ret +" Size: "+map.size());
		DisplayMap.display(map);
	}
	
	//No duplicate key-value pair
	static void NoDuplicateKeyValuePair(String typeOfMap, Map<String,Integer> map){
		
		map.put("10", 10);
		map.put("10", 10);
		System.out.println("######## "+typeOfMap +" ###########");
		DisplayMap.display(map);
	}
	
	//No Order
	static void demo4(){
		HashMap<Object, Object> hm = new HashMap();
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
	
	
}
