package reflection;
import java.util.LinkedList;

class School{
	String name;
}

class Student extends School{
	String name;
	
}

public class SuperClassNameDemo1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Manish");
		ll.add(2);
		ll.add(123.33);
		
	Student s = new Student();
		
		System.out.println("Super Class Name :"+Student.class.getSuperclass());
	}

}
