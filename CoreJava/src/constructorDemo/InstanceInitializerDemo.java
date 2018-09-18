package constructorDemo;
/* Instance initializer of super class will called each time of instance creation of child class 
 * It is called before constructor 
 * 
 */
class A{  
	A(){  
		System.out.println("parent class constructor invoked");  
	}  
	{
		System.out.println("\nsuper class intializer Hellow");
	}
}  
public class InstanceInitializerDemo extends A{
	public InstanceInitializerDemo(){  
		//super();  
		System.out.println("child class constructor invoked");  
	}  

	InstanceInitializerDemo(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  

	{
		System.out.println("instance initializer block in subclass is invoked");
	}  

	public static void main(String[] args) {
		InstanceInitializerDemo a = new InstanceInitializerDemo();
		InstanceInitializerDemo a1 = new InstanceInitializerDemo();
		InstanceInitializerDemo a2 = new InstanceInitializerDemo(2);

	}

}
