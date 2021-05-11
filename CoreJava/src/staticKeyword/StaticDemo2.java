package staticKeyword;

public class StaticDemo2 {

	public static void main(String[] args) {
		StaticDemo2 s = null;
		s.staticMethod();
		staticMethod();
		
		StaticClass ob1 = null;
		ob1.staticMethod2();
	}
	public static void staticMethod() {
		System.out.println("hi ");
	}
}


class StaticClass{
	public static void staticMethod2() {
		System.out.println("hi this static class static method");
	}
}