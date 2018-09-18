package zzClasses;

import java.util.Arrays;

public class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	int age;
	long phone[];
	
	public Employee() {
		
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Employee(int empId, String empName, long[] phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phone = phone;
	}
	
	public Employee(int empId, String empName,int age, long[] phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.phone = phone;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + Arrays.hashCode(phone);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (!Arrays.equals(phone, other.phone))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.age>e.age)
			return 1;
		else if(this.age< e.age)
			return -1;
		else
			return 0;
	}

	
}
