package collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapInSortedOrderDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "C");
		map.put(1, "Z");
		map.put(12, "Z33");
		map.put(7, "7");
		map.put(4, "ed");
		map.put(8, "Zad");
		map.put(3, "2sdf");
		map.put(17, "2sdf");
		
		for(Map.Entry<Integer, String> e : map.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println("Map Size: "+map.size());
	}

}
