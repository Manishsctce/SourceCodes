package interfaceDemo;

import interfaceDemo.NestedClassInterface.InterfaceNestedClass;

/* INTERFACE NESTED CLASS
 * to bind interface to our class
 * to define default implementation of interface method
 */

interface NestedClassInterface{
	
	void method1();
	class InterfaceNestedClass{
		void method1(){
			System.out.println("Hello Interface Nested class method, default implementaion");
		}
	}
}

public class InterfaceNestedClassDemo1 extends NestedClassInterface.InterfaceNestedClass{
	public static void main(String[] args) {
		
		InterfaceNestedClass inst = new InterfaceNestedClass();
		inst.method1();

	}

}
