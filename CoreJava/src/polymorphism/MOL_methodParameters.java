package polymorphism;
//METHOD PARAMETERs

class MO{

	/*public int sum(int i1, int i2){
		return i1+i2;
	}

	public float sum(int i1, float f2){
		return i1+f2;
	}

	public float sum(float f1, int i1){
		return f1+i1;
	}*/

	public double sum(int i1, double d1){
		return i1+d1;
	}

	public float sum (long l, float f){
		return l+f;
	}

	public double sum(double d1, int i1){
		return i1+d1;
	}

	public float sum(float f1, float f2){
		return f1+f2;
	}

	public double sum(double d1, double d2){
		return d1+d2;
	}

	public void test(Integer i) {
		System.out.println("Integer");
	}
	public void test(Long l) {
		System.out.println("Long");
	}
	public void test(Character c) {
        System.out.println("Character");
    } 
    public void test(Object o) {
        System.out.println("Object");
    }
    public void test(Byte o) {
        System.out.println("byte");
    }
}
public class MOL_methodParameters {
	public static void main(String[] args) {
		MO mo = new MO();
		//System.out.println("Return: "+ mo.sum(1,2));
		System.out.println("Return: "+ mo.sum(1,2.2));

		System.out.println("Return: "+ mo.sum(1.0f,2.2));
		System.out.println("Return: "+ mo.sum(1.0f,2.2));
		
		short s = 10;
		mo.test(s);// first widen short to int and then box it to Integer, which is not possible.
		
		byte b =10;
		mo.test(b);//
	}
}
