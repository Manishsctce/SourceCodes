package keywords.instanceofDemo;

public class Test_Instanceof {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("s instanceof Test: "+ String.valueOf((s instanceof Test_Inside)?true:false));
		System.out.println("s instanceof Person: "+ String.valueOf((s instanceof Person)?true:false));
	}

}

interface School {
	public String getName();
	public String getPrincipal();
	public Teacher[] getAllTeachers();
	public Student[] getAllStudents(); 
}
interface Person {
	public String getName();
	public String getGender();
	public int getAge();	
}
class Teacher implements Person{

	public String getName() {	
		return null;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Student implements Person{

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Test_Inside extends Student{
	
}

