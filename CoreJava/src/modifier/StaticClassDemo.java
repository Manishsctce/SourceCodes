package modifier;

import modifier.TopClass.NestedStaticClass;
import modifier.TopClass.NestedClass;

/* NESTED CLASS
 * we can import NestedClass to create direct reference but cannot create instance directly
 * need enclosing class instance
 * STATIC NESTED CLASS 
 * for using static nested class directly we need to import it 
 * otherwise it can be use with TopClass name only 
 */
class TopClass{
	class NestedClass{
		int nestedClassVar;
		void nestedClassMethod(){
			System.out.println("This is Nested Class method");
		}
	}
	static class NestedStaticClass{
		int nestedStaticClassVar;
		void nestedStaticClassMethod(){
			System.out.println("This is Nested Static Class method");
		}
	}
}

public class StaticClassDemo {
	public static void main(String[] args) {
		TopClass tc = new TopClass();
		//TopClass.NestedClass nc = new TopClass.NestedClass();
		TopClass.NestedClass nc1 = tc.new NestedClass();
		TopClass.NestedClass nc2 = new TopClass().new NestedClass();
		
		//NestedClass nc3 = new NestedClass();// Not possible 
		NestedClass nc3 = tc.new NestedClass();// Not possible without importing modifier.TopClass.NestedClass
		
		TopClass.NestedStaticClass nsc = new TopClass.NestedStaticClass();

		//For using below, need to import modifier.TopClass.NestedStaticClass;
		NestedStaticClass nsc2 = new NestedStaticClass();
	}

}
