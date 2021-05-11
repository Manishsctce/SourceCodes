package utilityClasses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCollections {
	
	// List of Natural number
	public static List<Integer> getIntList(){
		//int intArr[] = new int[] {1,2,3,4,5,6,7};
		Integer intArr[] = new Integer[] {1,2,3,4,5,6,7};
		return Arrays.asList(intArr);
	}
	
	
	public static List<String> getStringList(){
		String sArray[] = new String[] { "A", "B", "C", "D" };
		return Arrays.asList(sArray);
	}
	
	//
	public static Map<String, List<String>> getEmployeeContacts() {
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));
		
		return people;
	}
	
	public static List<List<Integer>> getListofIntList(){
		List<Integer> list1 = Arrays.asList(1,2,3,111);
		List<Integer> list2 = Arrays.asList(4,5,6,222);
		List<Integer> list3 = Arrays.asList(7,8,9,333);
		 
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		
		return listOfLists;
	}

	public static List<String> getListOfAlltimeTop10Programmer(){
		return Arrays.asList("Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", 
				"Linus Torvalds", "Anders Hejlsberg", "Tim Berners-Lee", 
				"Brian Kernighan", "Ken Thompson", "Guido van Rossum", "Donald Knuth");
	}
}
