package utilityClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayUtility {
	
	public static <T> void displayArray_withPrintln(T...arr) {
		Arrays.asList(arr).forEach(System.out::println);
	}
	
	public static <T> void displayArray_withPrint(T...arr) {
		Arrays.asList(arr).forEach(a -> System.out.print(a +" "));
	}
	
	public static <T> void displayArray_withPrint(String message, T...arr) {
		System.out.println(message);
		Arrays.asList(arr).forEach(a -> System.out.print(a +" "));
	}
	
	public static <T> void displayList_withPrintln(List<T> list) {
		list.forEach(System.out::println);
	}
	
	public static <T> void displayList_withPrint(List<T> list) {
		list.forEach(a -> System.out.print(a +" "));
	}
	
	public static <T> void displayList_withPrint(String message, List<T> list) {
		System.out.println(message);
		list.forEach(a -> System.out.print(a +" "));
	}
	
	public static <K, V> void displayMap(Map<K, V> map) {
		
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " : "+ e.getValue());
		});		
	}
	
	public static void displayElement(String e) {
		System.out.print(e +" ");
	}
	
	public static void displayElementSeparatedByComma(String e) {
		System.out.print(e +", ");
	}
	
	public static void displayElement(int e) {
		System.out.print(e +" ");
	}
	
}
