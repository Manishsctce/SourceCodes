package superDemo;

class A{
	static int a = 10;
	static void display(){
		System.out.println("hello A here " + a);
	}
}

class B extends A {
//super cannot be used to call static methods (in a static context)	
	 void display2(){
		//super.a=15;
		super.display();
		System.out.println("Hi B here "+a);
	}
}

class C extends B{
	
}
public class Parent {

	public static void main(String[] args) {
		B b = new B();
		b.display2();

	}

}
