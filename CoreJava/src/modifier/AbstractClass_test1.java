package modifier;
//abstract class may have or may not hv abstract method
// #2 abstract class can implement the interface
// #3 We cann't define abstract method without abstract modifier in abstract class
interface Interface{
	public void interfaceMethod();
}
public abstract class AbstractClass_test1 implements Interface{ //#2
	public AbstractClass_test1() {
		System.out.println("Abstract class constructor");
	}
	
	public AbstractClass_test1(String str) {
		System.out.println("Abstract class constructor overloading" + str);
	}
	
	//public void method_without_abstract_modifier(); //#3
	
	public static void main(String[] args) {
		System.out.println("hello this is abstract class");
		
	}

}
