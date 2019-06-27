package cdp_2_factory1;

import java.util.Scanner;

public class FactoryDesignPatternTesting1 {

	public static void main(String[] args) {
		
		AbstractClass ab = null;
		System.out.println("Enter the class name: ");
		Scanner scan = new Scanner(System.in);
		
		//String input = scan.nextLine();
		
		Factory factory = new Factory();
		ab = factory.factoryMethod(scan.nextLine());
		
		doStuff(ab);
	}
	
	public static void doStuff(AbstractClass ab){
		ab.method1();		
		if(ab instanceof A){
			A a = (A)ab;
			a.Amethod1();
			a.Amethod2();
		}
		else if(ab instanceof B){
			B b = (B)ab;
			b.Bmethod1();
			b.Bmethod2();
		}
	}
}
