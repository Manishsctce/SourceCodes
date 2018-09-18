package collectionDemo;

public class Employee implements Comparable{
	int empId;
	String empName;
	int age;
	long phone;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName,int age, long phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.phone = phone;
	}

	@Override
/*	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		if(this.age == emp.age)
			return 0;
		else if (this.age > emp.age)
			return 	-1;
		else 
			return 1;
	}*/
	
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		if(this.age == emp.age){
			if(this.empId > emp.empId)
				return 1;
			else if(this.empId < emp.empId)
				return -1;
			else 
				return 0;
		}
		else if(this.age > emp.age)
			return 1;
		else
			return -1;
	}
}
