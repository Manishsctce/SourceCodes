package classesDemo;

import classesDemo.TopClass.StaticMemberClass1;

/* VARIOUS TYPE OF INNER CLASS - Anonymous class, Local inner class, member classs
 * 
 * Local inner class can not be private, protected or public 
 * because they exist only inside of local block or method. 
 * You can only use final modifier with local inner class.
 * 
 * Member Class can access private member of its enclosing class
 */
class TopClass{
	private String topClassVar;
	private static String topClassStaticVar;
	TopClass(){}
	TopClass(String topClassVar){
		this.topClassVar = topClassVar;
	}
	
	void topClassMethod1(){
		
		//static String topClassStaticLocalVar1;
		//static final String topClassStaticLocalVar2="";
		
		// LocalInnerClass cannot be private,public,protected.LocalInnerClass can be abstract and final only
		String str = "Member method local variable";
		MemberClass2 memberClass2 = new MemberClass2();
		memberClass2.memberClassMethod1();
		class LocalInnerClass{
			//String str = TopClass.this.topClassVar;
			void display(){
				//System.out.println("Local method of Local Inner class accessing local variable: "+str);
			}
		}
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.display();
	}
	
	class MemberClass1{
		//static String localMemberClassStaticVar;
		static final String localMemberClassStaticFinalVar="localMemberClassStaticFinalVar";
		void memberClassMethod1(){
			System.out.println("Member Class can access private member of its enclosing class: "+topClassVar);
		}
	}//End of MemberClass
	
	private class MemberClass2{
		
		void memberClassMethod1(){
			System.out.println("Member Class can access private member of its enclosing class: "+topClassVar);
		}
	}
	
	static class StaticMemberClass1{
		public void staticMemberClassMethod1(){
			System.out.println("static Member Class Method can access static var : "+topClassStaticVar);
			//System.out.println("static Member Class Method cannot access non-static var"+topClassVar);
		}
	}
}

public class InnerClassesDemo2 {
	public static void main(String[] args) {
		
		TopClass topClass1 = new TopClass("Manish");	
		topClass1.topClassMethod1();
		
		TopClass.MemberClass1 memClass1 = new TopClass("Agrawal").new MemberClass1();
		memClass1.memberClassMethod1();
		System.out.println(memClass1.localMemberClassStaticFinalVar);
		
		TopClass.MemberClass1 memberClass1 = topClass1.new MemberClass1();
		memberClass1.memberClassMethod1();
		
		/* Cannot instantiate the private member class outside the class
		 *		 
		TopClass.MemberClass2 memberClass2 = topClass1.new MemberClass2();
		memberClass2.memberClassMethod1();/*/
		
		topClass1.topClassMethod1();
		
		
		StaticMemberClass1 staticMemberClass1 = new StaticMemberClass1();
		staticMemberClass1.staticMemberClassMethod1();
	}

}
