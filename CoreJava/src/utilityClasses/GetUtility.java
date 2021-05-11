package utilityClasses;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import zzClasses.Celebrity;
import zzClasses.Emp;
import zzClasses.Employee;

public class GetUtility {
	public static String[] names1 = {"Manish", "Anu", "Rishank", "Gaurav", "Pankaj", "Amit","David", "Lisa", "Robert", "Michael", "Mary", "Sagar", "Vipul"};//9
	
	public static String[] duplicate_names1 = {"Manish", "Anu", "Rishank", "Gaurav", "Pankaj", "Amit","David", "Lisa", "Robert", "Michael", "Mary", "Sagar", "Vipul", "Manish","Rishank", "Gaurav"};
	public static String[] duplicate_names2 = {"mary","Amit","David", "Lisa", "Robert", "james", "James", "Michael", "Mary","amit"};
	
	public static List<String> getNameList(){
		return Arrays.asList(names1);
	}
	
	public static List<String> getNameListHavingDuplicateNames(){
		return Arrays.asList(duplicate_names1);
	}
	
	public static List<String> getNameListHavingNullValue(){
		List<String> list = Arrays.asList(duplicate_names1).stream().collect(Collectors.toList());
		list.add(""); 
		list.add(null);
		return list;
	}
	
	public static Map<String, Double> getMapOfNameAndSalary(){
		Map<String,Double> map = new HashMap<>();
		map.put("John Doe", new Double(3434.34));
		map.put("Tom Smith", new Double(123.22));
		map.put("Jane Baker", new Double(1378.00));
		map.put("Tod Hall", new Double(99.22));
		map.put("Ralph Smith", new Double(1999.08));
		map.put("Manish", new Double(199999.08));
		
		return map;
	}
	
	public static List<Integer> getNumberList() {
		//int numbers[] = new int[10];
		
		Integer[] numbers = {11,2,31,44,121,155, 0, 323,333,999};
		return Arrays.asList(numbers);
	}
	
	public static List<Emp> getEmpList(){
		Emp e1 = new Emp(1,"Manish", 3699999.0);
		Emp e2 = new Emp(2,"Gaurav", 129200.0);
		Emp e3 = new Emp(3,"Anu", 122344.0);
		
		List<Emp> empList = new ArrayList<>();
		empList.add(e1);empList.add(e2);empList.add(e3);
		
		return empList;
	}
	
	public static List<Emp> getEmpListHavingDuplicateName(){
		
		return Arrays.asList(
				new Emp(1,"Manish", 3699999.0),
				new Emp(2,"Gaurav", 129200.0),
				new Emp(3,"Anu", 122344.0),
				new Emp(4,"Manish", 122344.0),
				new Emp(5,"Pankaj", 32124.0),
				new Emp(6,"Pankaj", 827274.0),
				new Emp(7,"Arun", 11344.0)
			);
	}
	
	public static List<Celebrity> getCelebrities() {

		return Arrays.asList(
				new Celebrity("Dwayne Johnson", 'M', LocalDate.of(1972, Month.MAY, 2), "Hollywood"),
				new Celebrity("Chris Hemsworth", 'M', LocalDate.of(1983, Month.AUGUST, 11), "Hollywood"),
				new Celebrity("Robert Downey Jr.", 'M', LocalDate.of(1965, Month.APRIL, 4), "Hollywood"),
				new Celebrity("Bradley Cooper", 'M', LocalDate.of(1975, Month.JANUARY, 5), "Hollywood"),
				new Celebrity("Nicole Kidman", 'F', LocalDate.of(1967, Month.JUNE, 20), "Hollywood"),
				new Celebrity("Sofia Vergara", 'F', LocalDate.of(1972, Month.JULY, 10), "Hollywood"),
				new Celebrity("Scarlett Johansson", 'F', LocalDate.of(1984, Month.NOVEMBER, 22), "Hollywood"));

	}
	
	public static List<Employee> getEmployeeList(){
		
		return Arrays.asList(
				new Employee("Manish", "Agrawal", 31, 1000009.00, 9284457904l),				
				new Employee("Akanksha", "Agrawal", 31, 90000.00),
				new Employee("Gaurav", "Agrawal", 29, 1290000.00),
				new Employee("Shubhi", "Agrawal", 28, 190000.00),
				new Employee("Tom", "Jones", 45, 15000.00),
				new Employee("Hary", "Jones", 45, 7000.00),
				new Employee("Nitish", "Narayan", 24, 16000.00),
				new Employee("Nitish", " Sinha", 23, 8000.00),
				new Employee("Ethan", "Hardy", 23, 8000.00),
				new Employee("Nancy", "Smith", 22, 10000.00),
				new Employee("Deborah","Sprightly", 29, 9000.00),
				
				new Employee("Sagar","Gohad", 28, 10000.00),
				new Employee("Sanjay","Vani", 32, 150000.00),
				new Employee("Komal","Khatri", 23, 19000.00),
				new Employee("Laxmi","Bugade", 23, 10000.00),
				new Employee("Punam","Kale", 23, 10000.00),
				new Employee("Vipul","Jain", 23, 10000.00));
	}
}
