

public class Employee {
	private String empName;
	private String designation;
	
	public Employee(String empName, String designation) {
		super();
		this.empName = empName;
		this.designation = designation;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}	
	
	public String toString(){
		return "Name: "+empName+" Designation: "+designation;
	}
	
	public boolean equals(Object obj){
		if(obj == this)
			return true;
		
		if(obj.getClass()!= this.getClass())
			return false;
		
		Employee emp = (Employee)obj;
		if((this.empName==null || emp.empName !=null) && !(this.empName.equals(emp.empName)) )
			return false;
		
		if((this.designation==null && emp.designation!=null) || !(this.designation.equals(emp.designation)))
			return false;
		
		return true;
	}
}
