package reflection;

import java.util.Arrays;

public class GetPublicMemberClass {

	public static void main(String[] args) {
		
		Class concreteClass = ConcreteClass.class;
		Class<?>[] classes = concreteClass.getClasses();
		//[class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum, 
		//interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface,
		//class com.journaldev.reflection.BaseClass$BaseClassInnerClass, 
		//class com.journaldev.reflection.BaseClass$BaseClassMemberEnum]
		
		System.out.println("Get Public Classes: ");
		displayClasses(classes);
		
		System.out.println("Get Declared Classes: ");
		classes = concreteClass.getDeclaredClasses();
		displayClasses(classes);
		
	}
	
	public static void displayClasses(Class<?>[] classes){
		for(Class c : classes){
			System.out.println(c.getCanonicalName());
		}
	}
}	
