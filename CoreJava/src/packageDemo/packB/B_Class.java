package packageDemo.packB;
import packageDemo.packA.*;
/* We cannot access private,default,protected variable in other package even if we import that package
 * Except private all other access specifier can be use in the sub-class inside same package
 * except public all other access specifier cannot access outside the package
 * public,protected can be accessible within the subclass outside the package
 */
class class1{
	
	protected int var1;
	public int var2 = 0;
	int var3;
	private int var4;
	
	void method1(){
		
	}
}
class class2{
	class1 c1 = new class1();
	//Except private all other access specifier can be use in the other class inside same package
	void method2(){
		c1.var1 = 0;
		c1.var2 = 0;
		c1.var3 = 0;
	}
}

class ChildClassOfAnotherPackageClass extends A_Class{
	//public,protected can be accessible within the subclass outside the package
	void method1(){
		protectedVar = 0;
		publicVar = 0;
	}
}
public class B_Class {	
	public static void main(String args[]){
		A_Class aclass1 = new A_Class();
		//A_Class.
		//except public all other access specifier cannot access outside the package
		aclass1.publicVar = 0;
		
		// We cannot access private,default,protected variable in other package even if we import that package
		/*aclass1.privateVar = 0;
		aclass1.defaultVar = 0 ;
		aclass1.protectedVar=0;*/
		
		
		System.out.println(aclass1.getPublicVar());
		class1 c = new class1();
	}
}
