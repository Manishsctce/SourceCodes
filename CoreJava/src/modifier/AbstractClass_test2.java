package modifier;
// #1 Abstract class reference can initialize with null
// #2 Abstract class can have static methods 
/*interface  Vehicle{
	public int price = 20000;
	public int wheel = 0;
	abstract void cost();
	 void tax();
	
}*/

abstract class Vehicle{
	int price;
	int wheel;
	
	Vehicle(){}
	Vehicle(int price){
		this.price = price;
	}
	Vehicle(int wheel,int price){
		this.price = price;
		this.wheel = wheel;
	}
	abstract void cost();
	abstract void tax();
	
	public static void gst() { //#2
		System.out.println("GST applied!!");
	}
}


 class TwoWheeler extends Vehicle{
	/*abstract class is use when we need to initialize the variable with given value 
	 but using interface only constant value can be initialize*/ 

	public TwoWheeler() {
		//super(price);
	}
	public TwoWheeler(int price) {
		super(price);
	}
	public void cost(){
		System.out.println(2*price);
	}
	public void tax(){
		System.out.println(0.14*price);
	}
}

class FourWheeler extends Vehicle{
	public FourWheeler(int price){
	//	super(price);
	}
	public void cost(){
		System.out.println(4*price);
	}
	public void tax(){
		System.out.println(0.28*price);
	}
}
public class AbstractClass_test2 {
	public static void main(String[] args) {
		Vehicle bajaj = new TwoWheeler(20000);
		bajaj.cost();
		bajaj.tax();
		
		Vehicle hero = null; //#1
		hero.gst();
	}

}
