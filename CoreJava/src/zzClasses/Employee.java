package zzClasses;

import java.util.Arrays;

public class Employee implements Comparable<Employee>{
	static int count=1;
	
	int empId;
	String fname;
	String lname;
	int age;
	long phone[];
	double salary;
	
	public Employee() {
		
	}
	public Employee(int empId, String fname) {
		super();
		this.empId = empId;
		this.fname = fname;
	}
	public Employee(int empId, String fname, String lname) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
	}
	public Employee(String fname,int age) {
		super();
		this.empId = count;
		this.fname = fname;
		this.age = age;
		count++;
	}
	public Employee(int empId, String fname, long[] phone) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.phone = phone;
	}
	
	public Employee(String fname,int age, double salary) {
		super();
		this.empId = count;
		this.fname = fname;
		this.age = age;
		this.salary = salary;
		count++;
	}
	public Employee(String fname,String lname, int age, double salary) {
		super();
		this.empId = count;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
		count++;
	}
	public Employee(String fname,int age, double salary, long phone) {
		super();
		this.empId = count;
		this.fname = fname;
		this.age = age;
		this.salary = salary;
		this.phone = new long[1];
		this.phone[0] = phone;
		count++;
	}
	public Employee(String fname,String lname,int age, double salary, long phone) {
		super();
		this.empId = count;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
		this.phone = new long[1];
		this.phone[0] = phone;
		count++;
	}
	public Employee(int empId, String fname,int age, long[] phone) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.age = age;
		this.phone = phone;
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empId;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
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
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		else if (!lname.equals(other.lname))
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
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long[] getPhone() {
		return phone;
	}
	public void setPhone(long[] phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + fname +", lastName=" + lname + ", age=" + age + ", phone="
				+ Arrays.toString(phone) + ", salary=" + salary + "]";
	}
}
