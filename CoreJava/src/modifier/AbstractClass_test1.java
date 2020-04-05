package modifier;
//abstract class may have or may not hv abstract method
// abstract class can implement the interface
// We cann't define abstract method without abstract modifier in abstract class
interface Interface{
	public void interfaceMethod();
}
public abstract class AbstractClass_test1 implements Interface{
	public AbstractClass_test1() {
		System.out.println("Abstract class constructor");
	}
	
	public AbstractClass_test1(String str) {
		System.out.println("Abstract class constructor overloading" + str);
	}
	
	//public void method_without_abstract_modifier();
	
	public static void main(String[] args) {
		System.out.println("hello this is abstract class");
		
	}

}
