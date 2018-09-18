package collectionDemo;

import java.util.*;

/* use of generic
 * 
 */
public class IteratorDemo_UseOfGenericWithCustomObject {

	public static void main(String[] args) {
		Students s1 = new Students(101,"Vijay",23);
		Students s2 = new Students(106,"Ajay",27);  
		Students s3 = new Students(105,"Jai",21);  
		
		//Student studentArray[] = {s1,s2,s3};
		List<Students> studentList = new ArrayList<Students>();
		studentList.add(s1);studentList.add(s2);studentList.add(s3);
		
		//studentList.add("Hello");//The method add(Student) in the type List<Student> is not applicable for the arguments (String)
		
		Iterator<Students> iterator = studentList.iterator();
		while(iterator.hasNext()){
			Students student = iterator.next();
			System.out.println(student.rollno +" "+ student.name+" "+ student.age);
		}
	}

}
