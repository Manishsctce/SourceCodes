package classesDemo;

import classesDemo.TopClass2.NestedStaticClass;

class Employee2{
	int empid;
	String name;
	char gender;
	public Employee2() {

	}
	public Employee2(int empid,String name,char gender) {
		this.empid = empid;
		this.name = name;
		this.gender = gender;
	}
	
	//static nested CLASS
	static class Address{
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
		
		//Static nested class method
		void display(){
			//Employee2 e = ;
			System.out.println("*****static nested class method displaying*******");
			//System.out.println(Employee2.empid + " " + e.name + " " + e.gender);
			System.out.println(houseNo+" "+houseName+" \n"+laneName+" "+city+" \n"+state);
		}
	}//End of Inner Class
	
	//Top class method 
	public void display(){
		System.out.println("*****Outer class method displaying*******");
		System.out.println(empid + " " + name + " " + gender +"\n");
		//member of inner class is invoke inside a class
	//	Address a = new Address();
		//a.display();
	}
}//End of Top class


public class StaticNestedClassDemo1 {
	public static void main(String[] args) {
		
		//here addr obj a2 is not associate with e2
		Employee2 e2 = new Employee2(622542,"Manish",'M');
		//Employee2.Address a2 = e2.new Address("B-51","Anmol Residency","Kaspatewasti","Pune","Maha");
		
		e2.display();//calling display of Address
		
		Employee2.Address a3 = new Employee2.Address("B-201","Anderi","Vishal Nagar","Pune","Maha"); 
		
		NestedStaticClass ns = new NestedStaticClass();

	}

}
