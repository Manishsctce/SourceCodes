package interfaceDemo;

import java.io.IOException;

/*
 * Anonymous class should implement all the method define in interface
 * Implementing class can use interface variable directly with interface name
 * 
 */

public class Interface_1_2_Test1 implements Interface1, Interface2{
	int roll1 = 1;
	public static void main(String[] args) {
		//String name = null;
		Interface_1_2_Test1 interfaceTest1 = new Interface_1_2_Test1();
		interfaceTest1.returnRoll();
		interfaceTest1.display();
		//System.out.println("Interface variable "+ name);
		interfaceTest1.method2();
		
		Interface1.method3();
	}
	
	//int returnRoll(){ //Cannot reduce the visibility of inherit method
	public int returnRoll(){
		return roll1;
		//return Interface2.roll;		
	}
	
	public void display(){
		System.out.println("Testing "+Interface1.roll + " "+Interface1.name);
	}

	/*public static void method2(){
		System.out.println("In our method2");
		System.out.println("Testing "+Interface1.roll + " "+Interface1.name);
	}*/
	public void method1() throws RuntimeException{
	
		
	}
/*	public void method1() throws Exception{
	
		
	}*/
/*	public static void methodOfInterfaceTest1(){
		//Interface2 interfaceDemo1 = new Interface2();
		//Interface2.ClassInsideInterface classInsideInterface = interfaceDemo1.new ClassInsideInterface(); 
	}*/
	
	
	//anonymous class definition
	Interface2 i = new Interface2() {		
		
		public int returnRoll() {
			return 0;
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub			
		}
	};
	
}
