package collectionDemo.mapDemo;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import utilityClasses.GetUtility;
import utilityClasses.DisplayUtility;

public class MapWithJava8 {

	public static void main(String[] args) {
		Map<String, Double> map = GetUtility.getMapOfNameAndSalary();
		
		Map<String, Double> newmap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		DisplayUtility.displayMap(newmap);
		System.out.println("-------------");
		
		Map<String, Double> filteredMap = map.entrySet().stream().filter(e -> "Manish".equals(e.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		DisplayUtility.displayMap(filteredMap);
		System.out.println("-------------");
		
		
		// John Doe 3434.34, Tom Smith 123.22, Jane Baker 1378.00, Tod Hall 99.22, Ralph Smith 1999.08, Manish 199999.08
		Map<String,Double> sortByValue = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		DisplayUtility.displayMap(sortByValue);
		
		
	}

}
