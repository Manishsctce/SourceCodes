package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//EMPLOYEE implement comparable
//STUDENT CANNOT SORT BCZ IT DOES IMPLEMENT COMPARABLE BUT CAN BE SORT WITH COMPARATOR WITHOUT CHANGING STUDENT CLASS

public class SortingUsingComparableDemo1 {
	public static void main(String[] args) {
		//Student students[] = new Student[3];
		
		Students s1 = new Students(101,"Vijay",23);
		Students s2 = new Students(106,"Ajay",27);  
		Students s3 = new Students(105,"Jai",21);  
		
		Students students[] = {s1,s2,s3};
		
		System.out.println(students);
		for(Students stud: students){
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno);
		}
		
		//CANNOT SORT BCZ STUDENT DOES IMPLEMENT COMPARABLE
		//Arrays.sort(students); // java.lang.ClassCastException
		/*System.out.println(students);
		for(Student stud: students){
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno);
		}*/
		long l[] = {9975158448l};
		
		Employee e1 = new Employee(101,"Vijay",23,9975158448l);
		Employee e2 = new Employee(106,"Ajay",27,9975158449l);  
		Employee e3 = new Employee(105,"Jai",21,9975158450l);
		Employee e8 = new Employee(208,"Gaurav",25,8087700876l);
		Employee e9 = new Employee(101,"Manish",26,8087706876l);
		Employee e10 = new Employee(121,"Rahul",27,8087709876l);
		Employee e11 = new Employee(201,"Preeti",26,8087723876l);
		Employee e12 = new Employee(301,"Sonali",26,8087721876l);
		
		Employee employees[] = {e1,e2,e3};
		System.out.println("**************Employees list without sorting*************");
		for(Employee emp : employees){
			System.out.println(emp.empId+" "+emp.empName+" "+emp.age);
		}
		
		Arrays.sort(employees);
		System.out.println("**************Employees array with Arrays sorting*************");
		for(Employee emp : employees){
			System.out.println(emp.empId+" "+emp.empName+" "+emp.age);
		}
		
		//Collections.sort(employees); //not application for employees[] Only applicable for list
		List <Employee>empList = new ArrayList<Employee>();
		empList.add(e1);empList.add(e2);empList.add(e3);
		empList.add(e8);empList.add(e9);empList.add(e10);empList.add(e11);empList.add(e12);
		Collections.sort(empList);
		System.out.println("**************Employees list implements comparable showing Collections sorting *************");
		for(Employee emp : empList){
			System.out.println(emp.empId+" "+emp.empName+" "+emp.age);
		}
		
		
	}
}
