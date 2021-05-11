package collectionDemo.mapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("1", "val1");
		linkedHashMap.put("2", "val2");
		linkedHashMap.put("3", "val3");
		linkedHashMap.put("4", "val4");
		
		System.out.println(linkedHashMap);
//		
//		linkedHashMap.get("2");
//		
//		System.out.println("Replace 3 :"+ linkedHashMap.replace("3", "value3"));
//		linkedHashMap.putIfAbsent("4", "value4");
//		linkedHashMap.putIfAbsent("5", "value5");
		
		System.out.println(linkedHashMap);
	}

}
