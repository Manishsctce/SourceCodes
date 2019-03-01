package zzJavaObjective;
//method invocation call most specific method in the class
public class BasicQuestion1 {
	public static void method(String s){
		System.out.println("String");
	}
	public static void method(Object i){
		System.out.println("Object");
	}
	
	public static void method(Byte i){
		System.out.println("Byte: "+i );
	}
	public static void method(Short i){
		System.out.println("Short: "+i);
	}
	public static void method(Integer i){
		System.out.println("Integer: "+i);
	}
	
	public static void method(Long i){
		System.out.println("Long: "+i);
	}
	
	
	public static void method(Double i){
		System.out.println("Double: "+i);
	}
	
	public static void method(Float i){
		System.out.println("Float: "+i);
	}
	public static void main(String[] args) {
		//As we have overloaded method that contain class of same level. Compiler wont understand which method. So says ambiguous method
		//method(null);  
		
		byte b = 1;
		short s = 1;
		int i1 = 1;
		Integer i2 = 1;
		
		long l1 = 1;
		Long l2 = 1l; 
		/*for autoboxing to specific class we need to provide proper primitive value using extension. 
		As bcz compiler autobox doesn't know whether the value is int or long correctly
		*/
		double d1 = 3.14;
 		Double d2 = 1d;
		
 		float f1 = 1;
		Float f2 = 1f;
		
		i1 = (int)d1;
		
		method(d1);
	}

}
