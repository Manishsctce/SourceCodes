package exception;
/*
 * If the superclass method declares an exception, subclass overridden method can declare same,subclass exception 
 * or no exception but cannot declare parent exception. But it is not in case of unchecked exception 
 */

import java.io.*;
class A
{
	public void display() throws ArithmeticException
	{
		
		System.out.println("Hello");
	}
}

class B extends A
{
	//HERE we r throwing parent class exception in our child class which is acceptable in unchecked exception only
	public void display() throws RuntimeException
	//sub-class of RuntimeException is possible  IOException bcz there is no IO operation
	{
		System.out.println("Hi");
	}
}

//Compile time error
public class ExceptionOverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
