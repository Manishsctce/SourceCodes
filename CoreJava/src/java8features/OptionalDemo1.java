package java8features;

import java.util.Arrays;
import java.util.List;

import zzClasses.Employee;

import static stringDemo.PermutationOfString.permutation;

public class OptionalDemo1 {

	public static void main(String[] args) {
	//System.out.println("Value "+  
		getEmployees().stream()
			.filter(e -> e.getEmpName().equalsIgnoreCase("Manish"))
			.map(en -> permutation(en.getEmpName()))
			.forEach(System.out::print);
	//);
			
		
	}
	
	public static List<Employee> getEmployees(){
		return Arrays.asList();
		//return Arrays.asList(new Employee("Manish", 31), new Employee("Gaurav", 29));
	}
	
	
}
