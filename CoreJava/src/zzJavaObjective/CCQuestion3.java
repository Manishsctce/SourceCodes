package zzJavaObjective;

public class CCQuestion3 {
	public static void method(Exception e){
		System.out.println("Exception");
	}
	public static void method(Object o){
		System.out.println("Object");
	}
	public static void method(ArithmeticException ae){
		System.out.println("ArithmeticException");
	}
	public static void main(String[] args) {
		method(null);

	}

}
