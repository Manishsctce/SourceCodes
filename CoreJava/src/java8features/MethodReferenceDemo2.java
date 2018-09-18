package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Sayable{
	void say();
	//void notSay();
}
public class MethodReferenceDemo2 {

	public static void saySomething(){
		System.out.println("Hello, this is static method.");
	}
	public static void main(String[] args) {
		/*Sayable sayable = new Sayable(){ public void say(){
				MethodReferenceDemo2.saySomething();
			}
		};*/
		
		//Sayable sayable = ()->MethodReferenceDemo2.saySomething();
		
		// Referring static method
	    Sayable sayable = MethodReferenceDemo2::saySomething;
	    // Calling interface method
	    sayable.say();	
	}

}
