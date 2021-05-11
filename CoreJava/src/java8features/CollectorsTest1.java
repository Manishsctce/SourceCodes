package java8features;

import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.stream.Collectors;

import java.util.concurrent.atomic.AtomicInteger;

import java.util.stream.IntStream;

import utilityClasses.DisplayUtility;
import utilityClasses.GetUtility;
import zzClasses.Employee;

public class CollectorsTest1 {
	static List<Employee> employeeList = GetUtility.getEmployeeList();

	public static void groupingAndFiltering() {
		//List<String> strings = List.of("a", "bb", "cc", "ddd");
//		Map<Integer, List<String>> result = strings.stream()
//		  .collect(groupingBy(String::length, filtering(s -> !s.contains("c"), Collectors.toList())));
//		System.out.println(result); // {1=[a], 2=[bb], 3=[ddd]}
	}
	
	
	public static void main(String[] args) {
		
		List<Employee> sortedEmpList = 
				employeeList.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println("Sorted Employee List with salary: ");
		DisplayUtility.displayList_withPrintln(sortedEmpList);
		System.out.println("------------------------");
		
		Optional<Employee> maxSalaryEmp = 
				employeeList.stream()
				.collect(maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Employee with max salary: "
				+ (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
		
		Optional<Employee> minAgeEmp =    
				employeeList.stream()
				.collect(minBy(Comparator.comparing(Employee::getAge)));
		System.out.println("Employee with min age:"
				+ (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
		
		
		Map<Integer, List<Employee>> map = employeeList.stream().collect(groupingBy(e -> e.getAge()));
		System.out.println(map);
		
		System.out.println("------------------------");
		Map<Object, Object> maxAgeEmpGroupByAge = 
				employeeList.stream().collect(Collectors.groupingBy(e-> e.getAge(), 
				Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Employee::getAge)), Optional::get)));
		System.out.println("Max Age Employee GroupBy Age: ");
		
		DisplayUtility.displayMap(maxAgeEmpGroupByAge);
		System.out.println("------------------------");
		
		Map<Object, List<Employee>> empListGroupByAge = 
				employeeList.stream().collect(Collectors.groupingBy(e-> e.getAge(), 
				Collectors.toList()));
		System.out.println("Employee List GroupBy Age: ");
		DisplayUtility.displayMap(empListGroupByAge);
		System.out.println("------------------------");
		//GetUtility.getCelebrities().forEach(c -> System.out.println(c));
		AtomicInteger counter = new AtomicInteger();
		final Map<Object, List<Integer>> result = 
				GetUtility.getNumberList()
				.stream()
				.collect(groupingBy(n -> counter.getAndIncrement()/3));
		System.out.println(result);
		
		counter.set(0);
		
		IntStream.range(0, 10)
		.forEach(i -> System.out.println( counter.getAndIncrement()/3));
		
		System.out.println();
	}
}
