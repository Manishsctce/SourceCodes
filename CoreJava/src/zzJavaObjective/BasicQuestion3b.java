package zzJavaObjective;

/* 
 * According to java specs, in case of overloading, compiler picks the most specific function. 
 * Obviously String class is more specific than Object class
 */

public class BasicQuestion3b {

	public static void main(String[] args) {
		foo(null);
	}
	public static void foo(Object o) {
		System.out.println("Object impl");
	}
	public static void foo(String s) {
		System.out.println("String impl");
	}
}
