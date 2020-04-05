package polymorphism;

class A11{
	
	private void m1(){
		System.out.println("A11 m1");
	}
	
	private void m1(String s){
		System.out.println("A11 m1: "+s);
	}
	
	public void test2(String s) {
		m1(s);
	}
}

class A12 extends A11{
	
	private void m1(String s){
		System.out.println("A12 m1: "+s);
	}
	
	public void test(String s) {
		m1(s);
	}
	
	public void test2(String s) {
		m1(s);
	}
}
public class MOR_PrivateMethodOverridingDemo1 {
	public static void main(String[] args) {
		A11 a = new A11();
		
		A11 a2 = new A12();
		//a2.test(); //bcz A11 doesn't have test()
		
		a2.test2("Manish");//OP: A12 m1: Manish
	}

}
