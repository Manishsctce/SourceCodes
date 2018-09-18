package interfaceDemo;
/* Interface have only public but abstract class have other  
 * if a class extends a class and impl interface 
 * both having common method then child class not show any error 
 * but if both have comman variable then it is ambiguous
 * 
 * the common class belong to both extending class and interface so cannot reduce visibility 
 */
interface Interface3{
	float pi = 3.14f;
	public abstract void interfaceMethod1();
	void commonMethod1();
	void commonMethod2() ;
}

abstract class AbstractClass1{
	float pi = 3.15f;
	protected abstract void abstractClassMethod1();
	protected abstract void commonMethod1();
	protected abstract void commonMethod2()throws Exception;
}

class ImplementationOfInterfaceAbstract extends AbstractClass1 implements Interface3{		
	//Cannot reduce visibility
	//void  interfaceMethod1(){}
	
	public void  interfaceMethod1(){}
	public void abstractClassMethod1(){
	}
	
	public void commonMethod1(){
		System.out.println("Common method1");
	//	System.out.println("Common method pi value is "+pi);//cannot use pi here ambiguous variable
	}
	public void commonMethod2(){}
}

public class InterfaceAbstactClassDemo1 {
	public static void main(String[] args) {
		AbstractClass1 abstractClass1 = new ImplementationOfInterfaceAbstract();
		
		Interface3 interface1 = new ImplementationOfInterfaceAbstract();		
	}
}
