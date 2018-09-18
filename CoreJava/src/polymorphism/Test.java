package polymorphism;

class A3{
	
	int m1(){
		return 10;
	}
	
	long m1(){
		return 20;
	}
}
class B3 extends A3{
	void m2(String s1){
		System.out.println("m2");
	}
}
class C3 extends B3{
	
}
public class Test {
	public static void main(String[] args) {
		A3 a3 = new C3();
		
		a3.m2("");
	}
}
