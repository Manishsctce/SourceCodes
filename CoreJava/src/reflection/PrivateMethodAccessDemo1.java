package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Employee{
	private int empNo;
	private String name;
	private Long mobile;
	public Employee(int empNo, String name, Long mobile) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", mobile="
				+ mobile + "]";
	}
	
	private String display(){
		return "Employee [empNo=" + empNo + ", name=" + name + ", mobile="
				+ mobile + "]";
	}
}

public class PrivateMethodAccessDemo1 {
	public static void main(String[] args) throws Exception {
		Employee emp1 = new Employee(1,"Manish",9975158448L);
		System.out.println(emp1);

		 
		Class employee = Class.forName("reflection.Employee");
		Object emp2 = employee.newInstance();
		
		Method meth = employee.getDeclaredMethod("display", null);
		meth.setAccessible(true);
		
		meth.invoke(emp2, null);
	}

}
