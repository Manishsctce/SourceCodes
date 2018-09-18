package polymorphism;
/* METHOD OVERRIDING 
 * Access specifier should not be more restrictive
 * Return type is the part of method signature in method overriding but not in overloading
 * Modifier also affect 
 * An overriding method can also return a subtype of the type returned by the overridden method
 * i cannt call child class method with parent class reference
 * cannot override final method
 */
class ParentClass{
	 void method1(){	
	}
	 public int method2(){
		return 0; 
	 }
	 
	  int method3(){
		  return 0;
	 }
	  
	 public Object method4(){
		 return 0;
	 }
	 
	public Integer method5(){
			return 0;
		}
	
	public String method6(){
		return "ret";
	}
	public final void finalmethod(){
		
	}
	
	private String method7(){
		return "parent meth7";
	}
}

class ChildClass extends ParentClass{
	int method1(){		
	}
	
	
	//int method2(){  //could not be more restrictive
	public int method2(){
		return 0;
	}
	//Modifier also affect 
	/*static int method3(){
		return 0;
	}*/
	
	//An overriding method can also return a subtype of the type returned by the overridden method
	public Integer method4(){
		return 0;
	}
	
	//Not allowed - should hv same return type or its subtype
	/*public String method5(){
		return "  ";
	}*/
	
	//not override
	public String method6(String str){
		return "ret";
	}
	
	public void childmethod1(){
		
	}
	//cannot override final method
	/*public final void finalmethod(){
		System.out.println("Sub Class final method : ");
	}*/
	
	public Object method7(){
		return "child meth7";
	}
}

public class MethodOverridingDemo2 {
	public static void main(String[] args) {
		
		ParentClass p = new ChildClass();
		
		
		
		//p.childmethod1();
		if(p instanceof ParentClass){
			ChildClass p1 = (ChildClass)p;
			p1.finalmethod();
		}
		else
			System.out.println("p is not instance of ParentClass");
	}

}
