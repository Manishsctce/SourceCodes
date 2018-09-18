package cloneable;
/* SHALLOW COPY
 * If the class has only primitive data type members then a completely new copy of the object will be created and the reference to the new object copy will be returned.
 * If the class contains members of any class type then only the object references to those members are copied and hence the member references in 
 * both the original object as well as the cloned object refer to the same object.
 */
public class CloneDemo2 {

	public static void main(String[] args) {
		Department dept1 = new Department(101, "Computer Science");
		Employee emp1 = new Employee(1001,"Manish",dept1);
		try {
			
			System.out.println("*****Original Object*****");
			System.out.println(emp1);
			
			Employee empClone = (Employee) emp1.clone();
			Department cloneDep1 = empClone.getDept();
			System.out.println("******Cloned Object****");
			System.out.println(empClone);
			
			
			emp1.setEmpname("Manish Agrawal");
			System.out.println("##Original obj empName set to "+emp1.getEmpname());
			System.out.println("**clone obj After changing in original obj primitive value");
			System.out.println(empClone);
			System.out.println("No effect on clone for primitive data");
			
			dept1.setDeptname("Computer Science Engineering");
			System.out.println("##Original dept deptName set to "+dept1.getDeptname());
			System.out.println("**clone obj After changing in original obj reference value");//reference obj reference get copied
			System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			empClone.setEmpname("Gaurav Agrawal");
			System.out.println("**Original obj After changing in clone obj primitive value");			
			System.out.println(emp1.empid+" "+emp1.getEmpname() + "\n"+dept1.getDeptid()+" "+dept1.getDeptname());
			//System.out.println(empClone.empid+" "+empClone.getEmpname() + "\n"+cloneDep1.getDeptid()+" "+cloneDep1.getDeptname());
			
			cloneDep1.setDeptname("Electronics and Communication");
			System.out.println("**Original obj After changing in clone obj reference value");
			System.out.println(emp1.empid+" "+emp1.getEmpname() + "\n"+dept1.getDeptid()+" "+dept1.getDeptname());
		} catch (Exception e) {
			System.out.println("");
		}
	}

}
