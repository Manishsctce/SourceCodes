package zzJavaObjective;
//a subclass can be to superclass but superclass cannot assign to subclass without casting
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends C{
	
}

public class CCQuestion4 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		a1 = b1;
		//c1 = b1;
		c1 = (C)b1;
		D d1 = new D();
		d1 = (D)b1;
		
		

	}

}
