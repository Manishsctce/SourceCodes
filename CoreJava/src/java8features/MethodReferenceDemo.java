package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("Tom Jones", 45), 
			      new Employee("Harry Major", 25),
			      new Employee("Ethan Hardy", 65),
			      new Employee("Nancy Smith", 15),
			      new Employee("Deborah Sprightly", 29));
		
		empList.forEach(e->System.out.println(e.getName()));
		//empList.forEach(System.out::println);

		  List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("------------Iterating by passing lambda expression---------------");  
	        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
	        System.out.println("------------Iterating by passing method reference---------------");  
	        gamesList.stream().forEachOrdered(System.out::println);  
	}

}
