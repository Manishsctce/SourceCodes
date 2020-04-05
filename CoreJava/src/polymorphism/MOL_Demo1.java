package polymorphism;

/*METHOD OVERLOADING
 * Return type doesnot include in method signature
 * Access specifier also doesnot effect method overloading 
 * method modifier doesnot affect method overloading it can be final, static, abstract
 * 
 * varargs method of Java5 implemented
 */
class Summation {
	// int side;
	Summation() {
	}

	/*
	 * public int sum(int a, int b){ System.out.println("int - int : "+(a+b));
	 * return (a+b); }
	 */

	// Return type doesnot include in method signature for method overloading
	/*
	 * public float sum(int a, int b){ return (a+b); }
	 */

	public void multipleVarAgrsMethod(String arp[], int[] a, String... str) {

	}

	// OVERLOADED METHODs
	public int sum(int... varargs) {
		System.out.println("--------Varargs----------");
		int sum = 0;
		for (int i : varargs)
			sum = sum + i;
		return sum;
	}

	public int sum(String a, int... varargs) {
		int sum = 0;
		for (int i : varargs)
			sum = sum + i;
		System.out.println("Varargs sum: "+ sum + " String : "+a);
		return sum;
	}
	
	// OVERLOADED METHOD - 1,3.0
	public float sum(int a, float b) {
		System.out.println("int - float:" + (a + b));
		return (a + b);
	}

	// OVERLOADED METHOD - 1,3.0
	public double sum(int a, double b) {
		System.out.println("int - double:" + (a + b));
		return (a + b);
	}

	// OVERLOADED METHOD
	public double sum(float a, int b) {
		System.out.println("float - int :" + (a + b));// 6.23
		return a + b;
	}

	// OVERLOADED METHOD
	private int sum(int a, float b, int c) {
		return 0;
	}

	// OVERLOADED METHOD
	public static double sum(double a, float f) {
		return a + f;
	}

	// OVERLOADED METHOD
	public final double sum(float f, double d) {
		return f + d;
	}
	// public double sum(float f,double d);
}

public class MOL_Demo1 {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Summation sum = new Summation();
		
		//sum.sum(5, 10);//CTE  sum(int[]) ambiguous method
		
		sum.sum("mani",5, 10); //Varargs sum: 15 String : mani
		
		sum.sum(1, 1.2f);//int-float:2.2
		sum.sum(1, 2.9);//int-double:3.9
		sum.sum(1, 3.9d);//int-double:4.9

		// CTE sum(int, int) in the type Summation is not applicable for the args (double, double)
		//sum.sum(7.3, 8.9);
		

		Summation sum2 = (Summation) Class.forName("polymorphism.Summation").newInstance();

		// System.out.println(sum.sum(5, 10,12,34));;
		float a = (float) sum.sum(6.2f, 3);
		System.out.println(sum2.sum(5, 10, 12, 34));
		;
	}

}
