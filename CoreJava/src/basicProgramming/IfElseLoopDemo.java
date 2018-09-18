package basicProgramming;
/* If execute only 1 loop
 *  In NO CASE BOTH STATEMENT BE EXECUTED
 */
class A{
	int a = 10;
	void method1(){
		
		if(a>5){
			System.out.println("a > 5");
			a = 2;
		}
		else if(a<5){
			System.out.println("a<5");
		}
		
		
	}
}

public class IfElseLoopDemo {
	public static void main(String[] args) {
		A a1 = new A();
		a1.method1();
	}

}
