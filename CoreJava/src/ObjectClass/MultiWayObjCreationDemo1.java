package ObjectClass;

class Summation{
	Summation(){		}
	
	public int sum(int a, int b){
		System.out.println("int - int : "+(a+b));
		return (a+b);
	}

	public int sum(int... varargs){
		System.out.println("--------Varargs----------");
		int sum = 0;
		for(int i : varargs)
			sum = sum + i;
		return sum;
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

public class MultiWayObjCreationDemo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Summation sum1 = new Summation();
		sum1.sum(10, 20);
		
		Summation sum2 = (Summation) Class.forName("Summation").newInstance();
		System.out.println(sum2.sum(5, 10,12,34));;
		
		Summation sum3 = (Summation) Summation.class.getClassLoader().loadClass("Summation").newInstance();
	}

}
