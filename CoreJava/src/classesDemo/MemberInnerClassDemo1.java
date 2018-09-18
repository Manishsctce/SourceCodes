package classesDemo;
/* MEMBER CLASS
 * to create instance of MEMBER class, an instance of outer class is required. 
 * Every instance of MEMBER class is bounded to one instance of Outer class.
 * 
 * 
 */
class Employee1{
	private int empid;
	String name;
	char gender;
	
	public Employee1() {

	}
	public Employee1(int empid,String name,char gender) {
		this.empid = empid;
		this.name = name;
		this.gender = gender;
	}
	
	//MEMBER CLASS
	protected class Address{
		String houseNo ;
		String houseName;
		String laneName;
		String city;
		String state;
		public Address() {

		}
		public Address(String hno,String hname,String lname, String city, String state) {
			this.houseNo = hno;
			this.houseName = hname;
			this.laneName = lname;
			this.city = city;
			this.state = state;
			
		}
		
		//MEMBER class method
		void display(){
			System.out.println("*****MEMBER class method displaying*******");
			System.out.println(empid + " " + name + " " + gender);
			System.out.println(houseNo+" "+houseName+" \n"+laneName+" "+city+" \n"+state);
		}
	}//End of MEMBER Class
	
	//Top class method 
	public void display(){
		System.out.println("*****Outer class method displaying*******");
		System.out.println(empid + " " + name + " " + gender +"\n");
		//member of MEMBER class is invoke inside a class
	//	Address a = new Address();
		//a.display();
	}
}//End of Top class

public class MemberInnerClassDemo1 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		System.out.println(e1);// give hashcode of object with class name

		Employee1.Address a1 = e1.new Address("B-51","Anmol Residency","Kaspatewasti","Pune","Maha");
		a1.display();
		
		//here we creating address obj associated with emp
		Employee1.Address e2 = new Employee1(622542,"Manish",'M').new Address("B-51","Anmol Residency","Kaspatewasti","Pune","Maha");
		e2.display();//calling display of Address
		
		Employee1 e3 = new Employee1(622678,"Rahul Ranjan",'M');
		Employee1.Address a3 = e3.new Address("B-201","Anderi","Vishal Nagar","Pune","Maha");//here addr obj a3 is associated with e3
		e3.display();//calling display of Employee1
		a3.display();
	}

}
