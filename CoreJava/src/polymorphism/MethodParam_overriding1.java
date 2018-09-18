package polymorphism;

public class MethodParam_overriding1 {

	public static void main(String[] args) {
		Parent p = new Child();
        p.testMethod(0);
        
        p.m2("Hello");// Parent: Hello
	}

}

class Parent{
    public void testMethod(Number n)
    {
        System.out.println("Parent");
    }
    
    public void m2(Object o){
    	System.out.println("Parent: "+o);
    }
}
 
class Child extends Parent{
	
	//This is not overridden method
    public void testMethod(Integer n) {
        System.out.println("Child");
    }
    
  //This is not overridden method
    public void m2(String o){
    	System.out.println("Child: "+o);
    }
}