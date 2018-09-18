package accessSpecifierDemo;

import accessSpecifierDemo2.Person;

public class ProtectedDefaultDemo1 extends Person{
	private String priVar1= "Private variable of ProtectedDefaultDemo1";
	protected String proVar1= "Protected variable of ProtectedDefaultDemo1";
	String defVar1 = "default variable of ProtectedDefaultDemo1";
	
	public static void main(String[] args) {
		
		accessSpecifierDemo.MyClass myc = new MyClass();
		System.out.println(myc.proVar1);
		System.out.println(myc.defVar1);
		
		 
		Person p1 = new Person(1,"Abc");
		System.out.println(p1.getName());
		//System.out.println(p1.getId());
	}
}
