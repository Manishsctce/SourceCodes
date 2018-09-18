package zzJavaObjective;
//Asked in Oracle
public class Question8 {

	public static void main(String[] args) {
		//int e#;
		String str = "";
		System.out.println("dfas"+str.isEmpty());
		int i = 3%2;
		double d = -10.0/-0;
		System.out.println(d);
		System.out.println("Args length: "+args.length);
		//String x[] = new String[-3];//java.lang.NegativeArraySizeException
		//if(i){}
		test();
	}
	
	public static void test(){
		byte a = 64, b;
		int i ;
		i = a<<2;
		b = (byte)(a<<2);
		System.out.println(a);
		System.out.println(i + " "+b);
	}

}
