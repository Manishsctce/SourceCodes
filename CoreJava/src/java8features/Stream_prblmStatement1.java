package java8features;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Assert;

import utilityClasses.DisplayUtility;
import utilityClasses.GetUtility;
import zzClasses.Employee;

public class Stream_prblmStatement1 {

	public static void main(String[] args) {
		//countWordFrequency();
		//empListGroupByAge();
		groupByExample();
		//to compute the set of last names of people in each city where the city names are sorted
		
	}
	
	static void groupByExample() {
		List<Employee> employeeList = GetUtility.getEmployeeList();
		DisplayUtility.displayList_withPrintln(employeeList);
		
		System.out.println("---------Group by Age------------");
		Map<Integer,List<Employee>> groupByAge = employeeList.stream()
				.collect(groupingBy(Employee::getAge));
		DisplayUtility.displayMap(groupByAge);
		
		System.out.println("---------Group by Age------------");
		Map<Integer,Map<String, List<Employee>>> groupByAgeAndThenLname = employeeList.stream()
				.collect(groupingBy(Employee::getAge, groupingBy(Employee::getLname)));
		DisplayUtility.displayMap(groupByAgeAndThenLname);
		
		
		System.out.println("---------Group by Age and Salary------------");
		Map<String,List<Employee>> groupByAgeAndSalary = employeeList.stream()
				.collect(groupingBy(emp -> new String(emp.getAge()+", "+emp.getSalary())));
		DisplayUtility.displayMap(groupByAgeAndSalary);
		
		System.out.println("---------Group by Age and Print its average Salary------------");
		Map<Integer,Double> groupByAgeAndGetAvgSalary = 
				employeeList.stream()
				.collect(groupingBy(Employee::getAge, averagingDouble(Employee::getSalary)));
		DisplayUtility.displayMap(groupByAgeAndGetAvgSalary);
		
		
//		System.out.println("---------Group by Age and then LastName------------");
//		Map<Integer,Map<String, List<Employee>>> groupByAgeAndLastName = employeeList.stream()
//				.collect(groupingBy(Employee::getAge, groupingBy(Employee::getLname)));
//		DisplayUtility.displayMap(groupByAgeAndLastName);
		
		
		System.out.println("---------Group by Age and Print FirstName------------");
		Map<Integer, List<String>> groupByAgeAndPrintFirstName = 
				employeeList.stream()
				.collect(groupingBy(Employee::getAge,  Collectors.mapping(Employee::getFname, Collectors.toList())));
		DisplayUtility.displayMap(groupByAgeAndPrintFirstName);
		
		
		System.out.println("---------Group by Age and Print MaxSalary Employee------------");
		Map<Integer, Optional<Employee>> groupByAgeAndPrintMaxSalaryEmployee = 
				employeeList.stream().collect(
					groupingBy(Employee::getAge, 
							Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
				);
		DisplayUtility.displayMap(groupByAgeAndPrintMaxSalaryEmployee);
		
		//Assert.assertEquals(2, map.get(45).size());
	}
	
	static void countWordFrequency() {
		List<String> wordsList = GetUtility.getNameListHavingDuplicateNames();
		DisplayUtility.displayList_withPrint(wordsList);
		
		Map<String, Long> collect = 
		        wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		DisplayUtility.displayMap(collect);
		
		Assert.assertEquals(2L, collect.get("Manish").longValue());
		//Assert.assertEquals(2L, collect.get("Sagar").longValue());
		//Assert.assertE
	}
	
	static void empListGroupByAge() {
		List<Employee> employeeList = GetUtility.getEmployeeList();
		DisplayUtility.displayList_withPrintln(employeeList);
		
		Map<Object, List<Employee>> empListGroupByAge = 
				employeeList.stream().collect(Collectors.groupingBy(e-> e.getAge(), 
				Collectors.toList()));
		System.out.println("Employee List GroupBy Age: ");
		DisplayUtility.displayMap(empListGroupByAge);
	}
}
