public class DataTypeTest {
 static int i;
 //static double pi = 3.14;
 //static float pi2 = 3.14f;
	public static void main(String[] args) {
		System.out.println(i);
	/*	FOR TESTING DATATYPE
	 * float f=1.3;
		char c="a";
		byte b=257;
		boolean b=null;
		int i=10; */ 
		
	/*
	 * can't make non-static reference in static method
		amethod(args); 
		} 
	public void amethod(String[] arguments) { 
		System.out.println(arguments); 
		System.out.println(arguments[1]);;
	*/	 
		
//		System.out.println(args[2]);
		int anar[]=new int[]{1,2,3};
		System.out.println(anar[1]);
		double pi = 3/7.0;
		float pi2 = (float) (3/7.0);
		System.out.println("double: "+pi+"float: "+pi2);
	} 

}


