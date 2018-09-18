package exception;

import java.io.IOException;

class MyClass3{
	void method1() throws IOException{
		
	}
}

class MyChildClass extends MyClass3{
	void method1() throws IOException {
		System.out.println("In child class");
	//	throw new IOException();
	}
}
public class CheckedExceptionDemo1 {

	public static void main(String[] args) {

		MyClass3 myClass3 = new MyChildClass();
		try {
			myClass3.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
