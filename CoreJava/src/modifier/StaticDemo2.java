package modifier;
/* STATIC METHOD
 * static method belong to the particular class that cn be child class
 * static method cannot override.It call with reference class
 */
class Parent{
	 static void method1(){
		System.out.println("hello");
	}
	 
	 static void method3(){
			System.out.println("method3 PARENT");
	  }
}
class Child extends Parent{
	static String childStaticVar = "Child Static variable";
	void method2(){
		Child c = new Child();
		c.method1();
	}
	
	 static void method3(){
			System.out.println("method3 CHILD");
		}

}
class Childchild extends Child{

}
public class StaticDemo2 {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.method1();//static method belong to the particular class that cn be child class
		//Parent.chi
		Child c = new Child();
		c.method1();
		Parent p2 = new Child();
		p2.method3();//static method cannot override.It call with reference class
	}

}
