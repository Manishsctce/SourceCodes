package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import zzClasses.Employee;

public class FI_FunctionDemo1 {
	
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("Tom Jones", 45), 
			      new Employee("Harry Major", 25),
			      new Employee("Ethan Hardy", 65),
			      new Employee("Nancy Smith", 15),
			      new Employee("Deborah Sprightly", 29));
		
		Function<Employee, String> funcEmpToString = (Employee e) -> {return e.getEmpName();};
		
		List<String> empNameList=convertEmpListToNamesList(empList, funcEmpToString);
	    empNameList.forEach(System.out::println);
	    
	}
	public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
		   List<String> empNameList=new ArrayList<String>(); 
		   /*for(Employee emp:employeeList){
		     empNameList.add(funcEmpToString.apply(emp));
		   }*/
		   employeeList.forEach((Employee e)->empNameList.add(funcEmpToString.apply(e)));
		   return empNameList;
	}
}
