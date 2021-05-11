package modifier;

class M{
	void method() {
		System.out.println("M method");
	}
}

abstract class N extends M{
	//abstract void method();
}

class O extends N{

	@Override
	void method() {
		System.out.println("O method");
		
	}
	
}
public class AbstractClass_test3 {

	public static void main(String[] args) {
		M m = new O(); 
		m.method();
	}

}
