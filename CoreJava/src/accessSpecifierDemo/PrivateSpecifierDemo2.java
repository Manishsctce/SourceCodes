package accessSpecifierDemo;
/* We can define private static method 
 * It can use non-static variable in the method with its object reference
 * we cannot use this keyword in static context
 */
class MyClass1{
	static int field  = 123;
	static void method1(MyClass1 objs){
		System.out.println(objs.field);//non-static variable in the method with its object reference
	}
	
	private static void method2(){
		MyClass1 obj = new MyClass1();
		method1(obj);
		//System.out.println(this.field);//we cannot use this keyword in static context
	}
}
public class PrivateSpecifierDemo2 {
	int field2 = 456;
	public static void main(String[] args) {
		MyClass1 myc1 = new MyClass1();
		MyClass1 myc2 = new MyClass1();
		myc2.field = 1000;
		myc1.method1(myc2);


	}
	static PrivateSpecifierDemo2 obj2;
	static void method3(){
		 System.out.println(obj2.field2);
	 }
	 static void method4(PrivateSpecifierDemo2 obj2){
		 System.out.println(obj2.field2);
	 }
	 
	 
}
