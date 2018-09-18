package polymorphism;

class A11{
	
	private void m1(){
		System.out.println("A11 m1");
	}
	
	private void m1(String s){
		System.out.println("A11 m1:"+s);
	}
}

class A12 extends A11{
	
	private void m1(String s){
		System.out.println("A11 m1"+s);
	}
}
public class PrivateMethodOverridingDemo1 {
	public static void main(String[] args) {
		A11 a = new A11();
		a.m	
		
		A11 a2 = new A12();
	}

}
