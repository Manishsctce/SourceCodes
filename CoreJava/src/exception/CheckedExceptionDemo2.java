package exception;

import java.io.IOException;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try{
			System.out.println("In try block");
			//throw new IOException();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			
		}
	}

}
