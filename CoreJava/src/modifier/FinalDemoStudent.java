package modifier;

//final class Gardian{	}
//FINAL CLASS CANNOT extend
	class Gardian{
	final String panNumber;
	
	public Gardian(String num) {
		panNumber =  num;
	}
		final void display(){
			System.out.println("hello final method");
		}
		///{	panNumber = "hel"; }
	}

public class FinalDemoStudent extends Gardian{
	FinalDemoStudent(){
		super("8");
	}
	public static void main(String[] args) {
		FinalDemoStudent s1 = new FinalDemoStudent();
		//final method cannot override but can be inherit		
		s1.display();
	}

}
