//base class for side1 generic triangle
package polymorphism;
/* Return type is the part of method signature in method overriding but not in overloading
 */

class Triangle {
	int side1, side2, side3;
	Triangle(){

	}
	public Triangle(int side1, int side2, int side3) {
		this.side1=side1; this.side2=side2; this.side3=side3;
	}

	//to calculate semi-perimeter for calculating Area of any Triangle
	public double calculatePerimeter() {
		return (side1+side2+side3);
	}
	
	public float calculateArea(int side){
		this.side1 = side;
		return 0;
	}
	public float calculateArea(int base, int height){return (base*height)/2;}
	
	private double calculateArea(int side1,int side2, int side3){
		/*HERON's formula area of triangle = sqrt[ sp(sp-side1)(sp-side2)(sp-side3) ] 
		sp is semi perimeter = perimeter/2   */
		double sp = calculatePerimeter()/2.0;
		double temp = sp*(sp-side1)*(sp-side2)*(sp-side3);
		double area = Math.sqrt(temp);
		return area;
	}
}

class EquilateralTriangle extends Triangle{
	private int side;

	EquilateralTriangle(int side){
		super(side,side,side);
		System.out.println("Equilateral Triangle");
		this.side = side;
	}

	public final float calculateArea(int side){
		//area of equilateral trinagle 1.732/4 * side * side
		//squareroot of 3 = 1.732
		
		this.side = side;
		return (float)(1.732*side1*side1)/4;
	}
	
	public double calculateArea(int side1,float side2,int side3){
		return 0.0f;
	}
}

/*class C extends EquilateralTriangle{
	public  int calculateArea(float side){	
		return 4;
	}
}*/
public class MethodOverridingDemo1 {
	public static void main(String[] args) {
		Triangle trianlge = new  EquilateralTriangle(10);
		System.out.println("Area :"+trianlge.calculateArea(8));

		Triangle t = new Triangle();
	}
}
