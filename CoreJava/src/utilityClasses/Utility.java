package utilityClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utility {
	public static String[] names1 = {"Pankaj","Amit","David", "Lisa", "Robert", "Michael", "Mary", "Sagar", "Vipul"};//9
	
	public static String[] duplicate_names1 = {"mary","Amit","David", "Lisa", "Robert", "james", "James", "Michael", "Mary","amit"};
	public static String[] duplicate_names2 = {"mary","Amit","David", "Lisa", "Robert", "james", "James", "Michael", "Mary","amit"};
	
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
	
	public static List<String> getNameList(){
		return Arrays.asList(names1);
	}
}
