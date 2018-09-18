package zzJavaObjective;
// method invocation call most specific method in the class

public class CCQuestion2 {
	/*public static void method(String s){
		System.out.println("String");
	}*/
	public static void method(Object o){
		System.out.println("Object");
	}
	public static void method(Integer s){
		System.out.println("Integer");
	}
	public static void method(int s){
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		method(null);

	}

}
