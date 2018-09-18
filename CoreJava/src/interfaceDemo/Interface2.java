package interfaceDemo;
/* INTERFACE
 * Interface class hv only public and abstract modifier; not static, final
 * variables are by default public, static and final and it must be initialize
 *  interface method cannot be static and Final
 *  
 *  we can define a class inside the interface. 
 *  use of inner class in interface is, we can write default implementation for interface methods.
 *  we can bind the nested class of interface to our class. So we didnt need to implement interface methods in our class
 *  
 *   we can mention throws Exception in our method signature
 */

public interface Interface2 {
	//private int rollNum; //not allowed only public, static and final are permitted
	//int rollNo; // all variable declare in interface must be initialize
	//String custName;
	int roll =2;
	String name ="Manish2";
	
	
	//static int returnRoll(); // interface method cannot be static and Final they are by default public and abstract
	 //int returnRoll();
	 
	 //all methods are by default abstract and public therefore no body of method
	 //void display(){    }
	 
	 void display(); ////Same method in Interface1
	// void method1() throws RuntimeException;

	 class ClassInsideInterface{
		 void ClassInsideInterfaceMethod(){
			 System.out.println("Class Inside Interface method saying hello");
		 }
	 }
	 
	 //Since Java8
	 /*public default String method2(){
			return "default method of Iterface2";
		}*/
}
