package classesDemo;
/* Anonymous class uses
 * it can be used to implement the method define in interface
 * it is a class that can have overriden method, member variable/methods
 * Anonymous class member variable can be used with the overriden method only bcz anonymous class does not have any name to use in future
 */

class SuperClass{
	void superClassMethod1(){
		System.out.println("Hello super class Method");
	}
	
	void superClassMethod2(Testing t){
		t.test();		
	}
}

interface Testing{
	void test();
}

class SubClass{
	
}

public class AnonymousClassDemo1 {
	public static void main(String[] args) {

		//here Reference of super class is extended by Anonymous class
		//super class method overridden by the anonymous class
		SuperClass superClass1 = new SuperClass(){
			void  superClassMethod1(){
				System.out.println("Hello super class method overriden in anonymous class");
			}
		};
		
		superClass1.superClassMethod1();
		
		//Cannot define like below 
		/*AnonymousClasss ac = new AnonymousClasss(){
			
		};*/
		//Another uses of Anonymous class 
		//here we implement anonymous class of the interface
		//Anonymous class member variable can be used with the overriden method only
		Testing t1 = new Testing(){
			public void test(){
				display();
				System.out.println("Anonymous class implementing Interface methods");
			}
			void display(){
				System.out.println("Anonymous class member method ");
			}
		};
		
		
		superClass1.superClassMethod2(t1);
	
		SubClass subClass = new SubClass(){
			public void display(){
				System.out.println("Anonymous class member methods ");
			}			
		};
		//subClass.display(); //No such uses
		
		//Third uses of Anonymous class
		SuperClass superClass2 = new SuperClass();
		superClass2.superClassMethod2(new Testing() {			
			@Override
			public void test() {
				System.out.println("Hello");				
			}
		});
		
		//We cannot write Anonymous class like below. it give "NewAnonymousClass cannot be resolved to a type" 
		/*NewAnonymousClass instance = new NewAnonymousClass(){
			void hello(){
				System.out.println("Say Hello");
			}
		};*/
		
	}
}
