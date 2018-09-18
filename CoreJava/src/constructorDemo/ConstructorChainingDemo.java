package constructorDemo;
/*
 * SUB CLASS CONSTRUCTOR
 */
class A3{
	/*A3(){
		System.out.println("A3 class default constructor");
	}*/
	A3(int a){
		System.out.println("A3 class para constructor");
	}
	A3(String str, int a){
		System.out.println(str +" : "+ a);
	}
}
class B extends A3{
	/*B(){
		//super(8);
	}*/
	B(int a) {
		super(a);
		System.out.println("B3(int a) : need to define super(int) otherwise compiler will complain");
	}
	
	B(String str){
		//super(str,1);
		System.out.println(str);
	}
		
}
class C extends B{

	/*C(){
		//super(4);
	}*/
	C(int a,int b) {
		super(a);
	}
	
}
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		//B b1 = new B(4);
		//C c1 = new C(4,5);		
		//A3 a = new C(4,5);
		
		A3 a = new B("m");
	}

}
