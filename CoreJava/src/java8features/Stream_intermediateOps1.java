package java8features;

import java.util.stream.Collectors;

import utilityClasses.DisplayUtility;
import utilityClasses.GetUtility;

/** 
 * Intermediate Operations
 * filter()
 * map()
 * flatMap()
 * distinct()
 * sorted()
 * peek()
 * limit()
 * skip()
 *
 */

public class Stream_intermediateOps1 {
	
	// used to peek through each step
	// USED FOR DEBUGGING ISSUES
	public static void peek() {

		//"Pankaj","Amit","David", "Lisa", "Robert", "Michael", "Anu", "Rishank", "Mary", "Sagar", "Vipul", "Manish"
		GetUtility.getNameList().stream()
			.filter(e -> e.length() > 4)
			.peek(e -> System.out.println("Filtered value: " + e))
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped value: " + e))
			.collect(Collectors.toList());	
	}
	
//	- it return stream containing first n ele 
//	- it is short-circuit opr when it is presented with infinite stream bcz it make it finite.
	public static void limit() {
		GetUtility.getNameList().stream().limit(5).forEach(DisplayUtility::displayElement);
		System.out.println();
	}
	
//	- it discards the first n elements of a stream. 
//	- it is a stateful operation
	public static void skip() {
		GetUtility.getNameList().stream().skip(5).forEach(DisplayUtility::displayElement);
		System.out.println();
	}
	
	public static void distinct() {
		GetUtility.getNameListHavingDuplicateNames().stream().distinct().forEach(DisplayUtility::displayElement);
	}
	public static void main(String[] args) {
		//peek();
		limit();
		skip();
		distinct();
	}
}
