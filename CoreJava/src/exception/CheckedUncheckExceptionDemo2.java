package exception;
/*
 * throw keyword can throw an exception type must be a subclass of Throwable 
 */
class MyClass1 {
	void myClass1method1(){
		
	}
}

class MyClass2 {
	void myClass2method1(){
		MyClass1 myClass1 = new MyClass1();
		//throw myClass1;//an exception type must be a subclass of Throwable
	}
}
public class CheckedUncheckExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
