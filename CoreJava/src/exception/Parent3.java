package exception;
import java.io.*;
/*If the superclass method declares an exception, 
 * subclass overridden method can declare same, subclass exception or no exception 
 * but cannot declare parent exception.
 * 
 */
  
class Parent3{  
	void msg()throws ArithmeticException{
		System.out.println("Parent3");
	}  
}  
//subclass overridden method cannot declare parent exception
class Child3 extends Parent3{  
	void msg() throws Exception{
		System.out.println("Child3");
	}  
}

//subclass overridden method can declare same
class Child3b extends Parent{  
	void msg()throws ArithmeticException{
		System.out.println("Child3");
	}  

	public static void main(String args[]){  
		Parent3 p=new Child3();  
		try{  
			p.msg();  
		}
		catch(Exception e){

		}  
	}  
}  