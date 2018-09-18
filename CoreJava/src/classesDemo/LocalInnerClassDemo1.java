package classesDemo;
/*
 * Local Inner class can access only final local variable 
 */

class TopClass1{
	private String topClassVar;
	private static String staticStr;
	private final String finalStr= "CONSTANT";
	String topClassdefaultStr;
	
	TopClass1(String topClassVar){
		this.topClassVar = topClassVar;
	}
	
	static void topClassMethod1(){
		// LocalInnerClass cannot be private,public,protected. LocalInnerClass can be abstract and final only
		String str = "Member method local variable";
		String nonFinalVar = "";
		int nonFinalInt = 0;
		final String str2 = "Final String";
		
		//static String localStaticvar="";
		//private String privateStrInMethod;//Cannot use access modifier inside Method
		
		//- member interface can only be defined inside a top-level class or interface or in a static context
		/*interface MyLocalInterface{
			
		}*/
		
		class MyLocalInnerClass{
			//Local Inner class can have  
			String parentstr = TopClass1.this.topClassVar;		
			static String staticInnerClassvar = "hey";
			String memberMethodVar = str;
			
			void display(){
				
				//Local inner class can access Parent class variable
				System.out.println("Local Inner class accessing parent class variable: "+topClassVar);
				
				System.out.println(topClassdefaultStr);
				
				//Cannot use non-final variable of member method of parent class
				System.out.println("Local method of Local Inner class accessing local variable: "+nonFinalVar + ":"+ nonFinalInt);
				
				// Local Inner class can access only final local variable
				System.out.println("Local Inner class accessing final local variable: "+str2);
			}
		}
		//LocalInnerClass localInnerClass = new LocalInnerClass();
		//localInnerClass.display();
	}
}


public class LocalInnerClassDemo1 {
	public static void main(String[] args) {


	}

}
