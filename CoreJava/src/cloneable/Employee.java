package cloneable;

class Employee implements Cloneable{
	 int empid = 100;
	private String empname = "Manish";
	Department dept;
	
	Employee(){}
	public Employee(int empid,String name,Department dept) {
		this.empid = empid;
		this.empname = name;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	//to allow clients to clone it’s instances, it must override Object’s clone method with a public modifier.
	protected Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {		
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public String toString(){
		return empid+" "+empname+" "+ dept.toString();
	}
}
