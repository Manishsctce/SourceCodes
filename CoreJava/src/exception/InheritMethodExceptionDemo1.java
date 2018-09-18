package exception;
import java.io.*;  

/* Exception Rule
 *  If the superclass method does not declare any exception throws by the class, then 
 * subclass overridden method cannot declare checked exception but can declare unchecked exception
*/

class Parent{  
	void method1(){
		System.out.println("parent method1");
	}  
}  
class Child   extends Parent{
	//can declare unchecked exception
		void method1() throws RuntimeException{
			//throw Exception
			System.out.println("child method1");
		}
		
		

}
class InheritMethodExceptionDemo1 {  	
	public static void main(String args[]){  
		Parent p=new Child();  
		//p.msg();
		p.method1();
	}  
}  