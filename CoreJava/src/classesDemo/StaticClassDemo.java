package classesDemo;

import classesDemo.TopClass2.NestedStaticClass;
import classesDemo.TopClass2.NestedClass;

/* NESTED CLASS
 * we can import NestedClass to create direct reference but cannot create instance directly
 * need enclosing class instance
 * Cannot be declared static in a non-static inner type
 * STATIC NESTED CLASS 
 * for using static nested class directly we need to import it 
 * otherwise it can be use with TopClass name only 
 */
class TopClass2{
	class NestedClass{
		int nestedClassVar;
		//static int staticvariable = 0;//Cannot be declared static in a non-static inner type
		void nestedClassMethod(){
			System.out.println("This is Nested Class method");
			enclosingClassMethod1();
		}
	}
	static class NestedStaticClass{
		int nestedStaticClassVar;
		void nestedStaticClassMethod(){
			System.out.println("This is Nested Static Class method");
			//enclosingClassMethod1(); //Non-Static method
			enclosingClassStaticMethod1();
		}
	}
	public void enclosingClassMethod1(){
		System.out.println("enclosing Class Method 1");
	}
	
	public static void enclosingClassStaticMethod1(){
		System.out.println("enclosing Class Static Method 1");
	}
}

public class StaticClassDemo {
	public static void main(String[] args) {
		TopClass2 tc = new TopClass2();
		//TopClass.NestedClass nc = new TopClass.NestedClass();
		TopClass2.NestedClass nc1 = tc.new NestedClass();
		TopClass2.NestedClass nc2 = new TopClass2().new NestedClass();		
		nc1.nestedClassMethod();
		
		//we can import NestedClass to create direct reference but cannot create instance directly
		//NestedClass nc3 = new NestedClass();// Not possible 
		NestedClass nc3 = tc.new NestedClass();// Not possible without importing modifier.TopClass.NestedClass
		
		
		System.out.println("********STATIC NESTED CLASS**************");
		TopClass2.NestedStaticClass nsc = new TopClass2.NestedStaticClass();

		//For using below, need to import modifier.TopClass.NestedStaticClass;
		NestedStaticClass nsc2 = new NestedStaticClass();
		TopClass2.NestedStaticClass nsc3 = new NestedStaticClass();
	}

}
