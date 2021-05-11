interface A5{
	default void m() {
		System.out.println("A5");
	}
}

interface A6{
//	default void m() {
//		System.out.println("A6");
//	}
}

class P{
//	void m() {
//		System.out.println("P");
//	}
}
class C extends P implements A5, A6{
	
}

public class Test {
	public static void main(String[] args) {
		System.out.println((int)( (Math.random()+5) *100));
	}
}
