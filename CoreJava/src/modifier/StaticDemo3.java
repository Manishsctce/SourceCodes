package modifier;
/*
 * static block loaded only once
 * Static block call when the class get loaded. even if we didnt created object of the class
 * static variable can also be use without creating object of the class
 * initializer block is call only when object is created
 * All the static blocks gets executed in the sequence they appear in the class
 */
class Class1{
	static int var1;
	static public String var2 = "Hello Manish";
	static{
		System.out.println("i m the 1st static block and static var1 :" + var1);
	}
	static void display(){
		System.out.println("display Static method and static var1 :"+var1);
	}
	Class1(){
		var1 = 5;
		System.out.println("Constructor called and static var1 :"+var1);
	}
	static{
		System.out.println("i m the 2st static block and static var1 :" + var1);
	}
	
	{
		System.out.println("initializer called");
	}
}

class Class2{
	
}
public class StaticDemo3 {
	public static void main(String[] args) {
		Class1.display();
		Class1 c1 = new Class1();
		System.out.println(Class1.var2);
		Class1 c2 = null;
		//: Static methods should not manage or alter any state
		System.out.println(c2.var2);//Not throwing null pointer exception
		//System.out.println(var2);
		Class1 c3 = new Class1();
		
	}

}
