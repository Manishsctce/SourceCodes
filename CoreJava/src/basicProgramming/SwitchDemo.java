package basicProgramming;

class A2{
	int expression = 10;
	void method1(){
		//here expression must be of type byte,short,int or char
		switch((expression>0)?1:0){
		case 0:
		//case 0: //Duplicate cases are not allowed
			System.out.println("case 0");
			break;//optional
		case 1:
			System.out.println("case 1");
			break;
		default://optional
			System.out.println("Default");
			
		}		
	}
	//cannot use double 
	/*void method2(){
		switch(10.05){
			case 10.05 :
				System.out.println("hellow");
		}
	}*/
	
/*	void method3(){
		Demo demo = new Demo();
		switch(demo){
		//case 
		}
	}*/
	
	
}

class Demo {
	
}
public class SwitchDemo {

	public static void main(String[] args) {
		A2 a1 = new A2();
		a1.method1();

	}
	
	public static void demo1(){
		int i=1;
		switch(i){
		///case 0,1:				
		}
	}

}
