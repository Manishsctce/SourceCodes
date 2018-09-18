package polymorphism;

/*
 * Overridden method can throw runtime exception even if parent method doesnot throw any exception
 */

import java.io.IOException;

class A{
	public void method1() {
		
	}
	
}

class B extends A{
	
/*	public int method1(){
		
	}*/
	
	public void method1() throws RuntimeException{
		
	}
}



class MethodOverridingDemo3 {
	public static void main(String[] args) {

	}

}
