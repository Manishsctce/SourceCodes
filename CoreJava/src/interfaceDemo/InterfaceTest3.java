package interfaceDemo;

interface MyInterface{
	void method1();
	void method2();
}

class MyClass{
	public void method1(){
		System.out.println("Method1");
	}
	public void method2(){
		System.out.println("Method2");
	}
}

class ConcreteImpl extends MyClass implements MyInterface{
	
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		ConcreteImpl c = new ConcreteImpl();
		c.method1();

	}

}
