package accessSpecifierDemo2;
import accessSpecifierDemo.MyClass;
import accessSpecifierDemo.ProtectedDefaultDemo1;

public class ProtectedDefaultDemo2 extends MyClass {
	protected String proVar1= "Protected variable of ProtectedDefaultDemo2";
	
	public static void main(String[] args) {
		Person p1 = new Person(1,"Abc");
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		
		
		// PROTECED  cann't be access in different package, even using instance 
		accessSpecifierDemo.MyClass myc = new MyClass();
		System.out.println(myc.proVar1);
		System.out.println(myc.defVar1);
	}
}
