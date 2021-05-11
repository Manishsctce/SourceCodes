package collectionDemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import utilityClasses.DisplayUtility;
import utilityClasses.GetUtility;
import zzClasses.Emp;

public class ListWithJava8 {

	public static void main(String[] args) {
		
		// USE MAX
		List<Integer> numberList = GetUtility.getNumberList();		
		int maxInteger = numberList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max number:"+ maxInteger);//999

		// USE MAX WITH CUSTOM COMPARATOR
		List<Emp> empList =  GetUtility.getEmpList();
		Comparator<Emp> empSalaryComparator = new Comparator<Emp>() {
			public int compare(Emp e1, Emp e2) {
				return e1.getSalary().compareTo(e2.getSalary());
			}
		};
		Double highestSalary = empList.stream().max(empSalaryComparator).get().getSalary();
		System.out.println("Highest Sal: "+ highestSalary);
		

		//SORT USING JAVA8 COMPARING
		List<Emp> empListHavingDuplicateName =  GetUtility.getEmpListHavingDuplicateName();
		Comparator<Emp> empComp = Comparator.comparing(Emp::getName).thenComparing(Emp::getSalary);
		List<Emp> sortedListWithNameThenSal = empListHavingDuplicateName.stream().sorted(empComp).collect(Collectors.toList());
		DisplayUtility.displayList_withPrintln(sortedListWithNameThenSal);
		
		
		// SORT USING JAVA8 COMPARATOR NULL FIRST/ NULL LAST
		List<String> nameListHavingNullValue = GetUtility.getNameListHavingNullValue();
		//Comparator<String> nameComp = Comparator.comparing(String::valueOf);
		Comparator<String> nameComp = Comparator.nullsFirst(Comparator.comparing(String::valueOf));
		nameListHavingNullValue.stream().sorted(nameComp).forEach(DisplayUtility::displayElementSeparatedByComma);
				
	}
}
