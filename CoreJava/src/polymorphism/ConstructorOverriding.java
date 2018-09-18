package polymorphism;

class A2{
	int a;
	A2(int a){
		this.a = a;
	}
}

class B2 extends A2{
	
	String A2(int a){
		
		return null;
	}
	B2(){
		super(4);
	}
	
}


public class ConstructorOverriding {
	public static void main(String[] args) {
		B2 b = new B2();
		b.A2(6);

	}

}
