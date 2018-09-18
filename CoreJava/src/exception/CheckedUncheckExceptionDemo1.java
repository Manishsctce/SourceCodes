package exception;
/* throws can be used to define checked and unchecked exception
 * throw keyword can also be used in place of return
 * throw keyword can be used inside method body or block 
 * It is mandatory to provide try catch or try finally block to handle checked Exception, 
 * while in case of RuntimeException this is not mandatory
 */
import java.io.IOException;

class MyClass{
	String method1() throws Exception, ArrayIndexOutOfBoundsException, IOException{
	//	throw new IOException();		
		throw new ArrayIndexOutOfBoundsException(); //throw keyword can also be used in place of return
		//return "Hello"; unreachable code
	}
	
	int method2() throws ArrayIndexOutOfBoundsException{
		//return 1;
		throw new ArrayIndexOutOfBoundsException();// if return then unreachable code
	}
	
	//throw keyword can be used inside method body or block 
	{
		try{
		throw new NullPointerException();}
		catch(NullPointerException n){
			
		}
	}
}

public class CheckedUncheckExceptionDemo1 {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		try{obj1.method1();}
		catch(Exception ex)
		{
			System.out.println("Checked exception is handled");
			}
		
		obj1.method2();// not necessary to handle unchecked exception
	}

}
