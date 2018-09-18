package polymorphism;
/*METHOD OVERLOADING
 * Return type doesnot include in method signature
 * Access specifier also doesnot effect method overloading 
 * method modifier doesnot affect method overloading it can be final, static, abstract
 * 
 * varargs method of Java5 implemented
 */
 class Summation{
	//int side;
	Summation(){		}
	
	/*public int sum(int a, int b){
		System.out.println("int - int : "+(a+b));
		return (a+b);
	}*/
	
	// Return type doesnot include in method signature
	/*public float sum(int a, int b){
		return (a+b);
	}*/
	public int sum(int ...varargs){
		System.out.println("--------Varargs----------");
		int sum = 0;
		for(int i : varargs)
			sum = sum + i;
		return sum;
	}
	public void multipleVarAgrsMethod(String arp[], int[] a, String...str){
		
	}
	public float sum(int a, float b){
		System.out.println("int - float" + (a+b));
		return (a+b);
	}
	
	public double sum(float a, int b){
		System.out.println("float - int :"+(a+b));//6.23
		return a + b;
	}
	
	private int sum (int a, float b, int c){
		return 0;
	}
	
	public static double sum(double a, float f){
		return 0.0;
	}
	
	public final double sum(float f,double d){
		return 0.0;
	}
	//public  double sum(float f,double d);
}

public class MethodOverloadingDemo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Summation sum = new Summation();
		
		Summation sum2 = (Summation) Class.forName("polymorphism.Summation").newInstance();
		
		
		
		//sum.sum(7.3, 8.9);//Compile-time error sum(int, int) in the type Summation is not applicable for the arguments (double, double)
		sum.sum(5, 10);
		
	//	System.out.println(sum.sum(5, 10,12,34));;
		float a = (float)sum.sum(6.2f, 3);
		System.out.println(sum2.sum(5, 10,12,34));;
	}

}
