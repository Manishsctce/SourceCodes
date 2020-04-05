package java8_transforming_code_to_java8;

import static utilityClasses.Utility.*;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressionUsecase1 {

	public static void main(String[] args) {
		sortArray();
		sortArrayUsingJava8Lambda();
		sortArrayUsingJava8MethodReference();
	}

	public static void sortArray() {
		String[] duplicate_names1 = duplicate_names2.clone();
		displayArray_withPrint("Before Sorting: ", duplicate_names1);
		
		Arrays.sort(duplicate_names1, new Comparator<String>() {
			public int compare(String o1, String o2) {				
				return o1.compareTo(o2);
			}
		});
		
		displayArray_withPrint("\nAfter Sorting: ",duplicate_names1);
	}
	
	public static void sortArrayUsingJava8Lambda() {
		displayArray_withPrint("\n\nBefore Sorting: ", duplicate_names2);
		Arrays.sort(duplicate_names2, (o1,o2) -> o1.compareTo(o2));
		displayArray_withPrint("\nAfter Sorting using java8 lambda: ",duplicate_names2);
	}
	
	public static void sortArrayUsingJava8MethodReference() {
		String[] duplicate_names2 = duplicate_names1.clone();
		displayArray_withPrint("\n\nBefore Sorting: ", duplicate_names2);
		Arrays.sort(duplicate_names2, String::compareTo);
		displayArray_withPrint("\nAfter Sorting using java8 methodReference: ",duplicate_names2);
	}
}
