package polymorphism;
//METHOD PARAMETER

public class MOL_methodParameter {
	
//	public static void test(int i) {
//		System.out.println("int");
//	}
	
	public static void test(byte i) {
		System.out.println("byte");
	}
	
	public static void test(Integer i) {
		System.out.println("Integer");
	}
	
	public static void test(Character i) {
		System.out.println("Character");
	}
	
	public static void test(Object i) {
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
//		byte b = 10;
//		test(b);
		
		int i = 15;
		test(i);
		
	}
}
