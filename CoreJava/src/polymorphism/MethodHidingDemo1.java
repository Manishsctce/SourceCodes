package polymorphism;
/*
 * PRIVATE AND STATIC METHOD DOESN'T OVERRIDE but it will be HIDE
	- static method doesn't override but inherit. 
	- Private method doesn't override and inherit. 
	- so we can use parent private method name in child class as per our use
 */
class SuperClass{
	public static void staticMethod1(){
		System.out.println("Super class static method1");		
	}
	
	//This method will be inherit by sub-class
	public static void staticMethod2(){
		System.out.println("Super class static method2");		
	}
	
	public void method2(){
		System.out.println("Super class normal method2");
	}
	
	private void privateMethod(){
		System.out.println("Super class private method");
	}
	
	private void privateMethod2(){
		System.out.println("Super class private method2");
	}
}
class SubClass extends SuperClass{
	public static void staticMethod1(){
		System.out.println("Sub class static method1");		
	}
	public void method2(){
		System.out.println("Sub class normal method2");
		privateMethod();		
	}
	
	private void privateMethod(){
		System.out.println("Sub class private method");
	}
	
	//we can use parent private method name in child class as per our use
	private Object privateMethod2(){
		System.out.println("This method is not override because private doesn't inherit by subclass");
		return "";
	}
}
public class MethodHidingDemo1 {

	public static void main(String[] args) {
		SuperClass superClassRef = new SubClass();		
		superClassRef.staticMethod1();//Super class static method1
		superClassRef.method2();//Sub class normal method2
		//superClassRef.privateMethod();//CANNOT CALL PRIVATE METHOD
		
		
		SubClass.staticMethod1();//Sub class static method1
		
		SubClass subClassObj = new SubClass();
		subClassObj.staticMethod1();//Sub class static method1
		subClassObj.staticMethod2();//Super class static method2
		subClassObj.method2();
		//subClassObj.privateMethod();//CANNOT CALL PRIVATE METHOD
	}

}
