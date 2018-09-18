package collectionDemo.mapDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByValue {

	public static void main(String[] args) {
		Map<String,String> sortMap = new HashMap<>();

		sortMap.put("1", "9");
		sortMap.put("2", "8");
		sortMap.put("3", "7");
		sortMap.put("4", "6");
		sortMap.put("5", "5");

		Set<Entry<String, String>> entries = sortMap.entrySet();

		Comparator<Entry<String, String>> valueComparator = 
				new Comparator<Entry<String,String>>() { 
			@Override 
			public int compare(Entry<String, String> e1, Entry<String, String> e2) { 
				String v1 = e1.getValue(); 
				String v2 = e2.getValue(); 
				return v1.compareTo(v2); 
			} 
		};

		// Sort method needs a List, so let's first convert Set to List in Java 
		List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries); 

		// sorting HashMap by values using comparator 
		Collections.sort(listOfEntries, valueComparator); 
		LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size()); 

		// copying entries from List to Map 
		for(Entry<String, String> entry : listOfEntries){ 
			sortedByValue.put(entry.getKey(), entry.getValue()); 
		} 

		System.out.println("HashMap after sorting entries by values "); 
		Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet(); 
		for(Entry<String, String> mapping : entrySetSortedByValue){ 
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
		}
	}
}
