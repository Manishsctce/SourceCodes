package classesDemo;

//Top Class
public class InnerClassStaticClassDemo1 {
	String commonvariable;
	InnerClassStaticClassDemo1(){
	}
	InnerClassStaticClassDemo1(String commonvariable){
		this.commonvariable = commonvariable;
	}	
	class LocalInnerClass{
		String commonvariable;
		LocalInnerClass(String commonvariable){
			//super(commonvariable);
			this.commonvariable = commonvariable;
			InnerClassStaticClassDemo1.this.commonvariable = commonvariable;// refering to top class variable
		}
		
		void localInnerClassMethod1(){
			System.out.println("LocalInnerClass method");
		}
		
	}
	
	static class StaticNestedClass{
		void staticNestedClassMethod1(){
			System.out.println("Static Nested Class Method1");
		//	System.out.println(commonvariable);//cannot  make static reference to non-static variable
		}
	}
	
	
	public static void main(String[] args) {
		InnerClassStaticClassDemo1.LocalInnerClass localInnerClass = new InnerClassStaticClassDemo1().new LocalInnerClass("Hello");
		localInnerClass.localInnerClassMethod1();
		
		
		//LocalInnerClass localInnerClass2 = new LocalInnerClass();
		
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		staticNestedClass.staticNestedClassMethod1();

	}

}
