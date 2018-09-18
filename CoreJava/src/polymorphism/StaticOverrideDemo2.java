package polymorphism;
// Static method doesn't override but it get inherited in subclass. 
class X{
	public static void method(){
		System.out.println("X method");
	}
}
class Y extends X{
	/*public static void method(){
		System.out.println("Y method");
	}*/
}

public class StaticOverrideDemo2 {	
	
	public static void main(String[] args) {
		Y y = new Y();
		y.method();//X method
	}

}
