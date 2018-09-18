package polymorphism;
// Static method doesn't override but it get inherited in subclass. 
class X1{
	public static void method(){
		System.out.println("X method");
	}
}
class Y1 extends X1{
	public static void method(){
		System.out.println("Y method");
	}
}

public class StaticOverrideDemo3 {	
	
	public static void main(String[] args) {
		Y1 y = new Y1();
		y.method();//Y method
		
		X1 xy = new Y1();
		xy.method();//X method
	}

}
