package cloneable;
//DEEP COPY
class Employee2 extends Employee{
	public Employee2(int empid,String name,Department dept) {
		super(empid,name,dept);
	}
	protected Employee2 clone(){
		Employee2 cloned = (Employee2)super.clone();
		Department2 deptclone = (Department2)cloned.getDept().clone();		
		cloned.setDept(deptclone);
		return cloned;
	}
}

class Department2 extends Department {
	public Department2(int deptid, String deptname) {
		super(deptid,deptname);
	}
	
}
public class CloneDemo3 {
	public static void main(String[] args) {
		Department2 dept2 = new Department2(101, "Computer Science");
		Employee2 emp2 = new Employee2(1001,"Manish",dept2);
		try {
			
			System.out.println("*****Original Object*****");
			System.out.println(emp2.empid+" "+emp2.getEmpname() + "\n"+dept2.getDeptid()+" "+dept2.getDeptname());
			Employee empClone = (Employee) emp2.clone();
			Department cloneDep1 = empClone.getDept();
			System.out.println("******Cloned Object****");
			System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			
			emp2.setEmpname("Manish Agrawal");			
			System.out.println("##Original obj empName set to "+emp2.getEmpname());
			System.out.println("**clone obj After changing in original obj primitive value");//No effect on clone for primitive data
			System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			dept2.setDeptname("Computer Science Engineering");
			System.out.println("##Original dept deptName set to "+dept2.getDeptname());
			System.out.println("**clone obj After changing in original obj reference value");//reference obj reference get copied
			System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			empClone.setEmpname("Gaurav Agrawal");
			System.out.println("**Original obj After changing in clone obj primitive value");			
			System.out.println(emp2.empid+" "+emp2.getEmpname() + "\n"+dept2.getDeptid()+" "+dept2.getDeptname());
			//System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			cloneDep1.setDeptname("Electronics and Communication");
			System.out.println("**Original obj After changing in clone obj reference value");
			System.out.println(emp2.empid+" "+emp2.getEmpname() + "\n"+dept2.getDeptid()+" "+dept2.getDeptname());
		} catch (Exception e) {
			System.out.println("");
		}

	}

}
