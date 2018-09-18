package collectionDemo.setDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	int age;
	long phone[];
	Map<String,Address> addrMap = new HashMap<String,Address>(); 
	
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
	
	class Address{
		private String line1;
		private String line2;
		private String city;
		private String state;
		private String country;
		private Long pin;
		
		public Address(){}
		public Address(String line1, String city, String state, Long pin){
			this(line1,city,state,null,pin);
		}
		public Address(String line1, String city, String state, String country,
				Long pin) {
			this(line1,null,city,state,null,pin);
		}
		public Address(String line1, String line2, String city, String state,
				String country, Long pin) {
			super();
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pin = pin;
		}
		public String getLine1() {
			return line1;
		}
		public void setLine1(String line1) {
			this.line1 = line1;
		}
		public String getLine2() {
			return line2;
		}
		public void setLine2(String line2) {
			this.line2 = line2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Long getPin() {
			return pin;
		}
		public void setPin(Long pin) {
			this.pin = pin;
		}
	}
}
