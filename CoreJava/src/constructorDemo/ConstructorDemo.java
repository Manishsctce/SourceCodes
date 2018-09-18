package constructorDemo;
/*
 * final is the instance variable and not intialize then 
 * it should be handled by all constructor and assign value in all constr. 
 */

public class ConstructorDemo {
	int var1;
	final int finalVar1;
	/* ConstructorDemo() {
		System.out.println("Default Constructor");
		finalVar1 = 0;
	}*/
	
	ConstructorDemo(int i){
		finalVar1=0;
	}
	//2. here ConstructorDemo(5) will not able to call this method bcoz it is not a constructor 
	  void ConstructorDemo(int x) {
		System.out.println("Default void Constructor"+x);
	}
	
	//3. here private access specifier doesn't give any error bcz in the same class
	private ConstructorDemo(int empid, double salary){
		System.out.println("Employee Id: "+empid+"\nSalary: "+salary);
		finalVar1 = empid;
	}
	
	public ConstructorDemo(double salary,int empid){
		//this();
		//this(empid,salary);
		System.out.println("Employee Id: "+empid+"\nSalary: "+salary);
		finalVar1 = empid;
	}
	public static void main(String[] args) {	
	//	new ConstructorDemo();		//1
		ConstructorDemo constructorDemo = new ConstructorDemo(5);	//2
		constructorDemo.ConstructorDemo(10);
		
		new ConstructorDemo(3,3000.0); //3
		//new ConstructorDemo(5,3000); //4 give error bcz of ambigous declaration of int and double as two constructor match
		new ConstructorDemo(5000.0,5);
		//ParentClass parentClass = new ParentClass(); //5. default access specifier constructor can be access
		//ParentClass parentClass2 = new ParentClass("Root");//here private constructor cannot be accessable bcz not in same class
		
	}

}
