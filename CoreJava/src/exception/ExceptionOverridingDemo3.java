package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A1{
	public void method1() throws IOException{
		
	}
}
class B1 extends A1{
	//sqlexception is not compatible with throws clause in A.method1
	//public void method1() throws SQLException{
	public void method1() throws RuntimeException, FileNotFoundException{
		throw new FileNotFoundException();
	}
}

public class ExceptionOverridingDemo3 {
	public static void main(String[] args) {


	}

}
