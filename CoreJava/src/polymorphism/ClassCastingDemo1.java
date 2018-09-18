package polymorphism;

interface Bouncing{
	void bounce();
}

abstract class HWVehicle implements Bouncing{
	
}
class Car extends HWVehicle{
	public void bounce(){
		System.out.println(this.getClass().getCanonicalName() + " bounce");
	}
}

class LuxoryCar extends Car{
	public void bounce(){
		super.bounce();
	}
}
class NormalCar extends Car{
	public void bounce(){
		super.bounce();
	}
}

public class ClassCastingDemo1 {

	public static void main(String[] args) {
		Bouncing b = new LuxoryCar();
		
		b.bounce();

	}

}
