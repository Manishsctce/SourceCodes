package stringDemo;

import java.util.Collections;
import java.util.List;

import utilityClasses.GetUtility;
import utilityClasses.DisplayUtility;


public class SortStringAsPerLength {

	public static void main(String[] args) {
		List<String> list = GetUtility.getNameList();
		
		list.stream().forEach(n -> System.out.print(n + " "));;
		
		Collections.sort(list);
		System.out.println();
		list.stream().forEach(n -> System.out.print(n+ " "));
	}

}
