package polymorphism;
/* Static method can be call with class name as it belongs to class
 * Static method can be overloaded but cannot override
 * 
 */
class Super{
	public static void display(){System.out.println("Super");}
	public static void display(String string){System.out.println("Super Class display "+string);}//Static method overloadeding
	
	protected static void method1(){
		System.out.println("In Super meth1");
	}
}
class Sub extends Super{
	public static void display(){System.out.println("Sub");}
	public static void display(int i){System.out.println("Sub"+i);}
	
	public static void method2(){
		System.out.println("In Sub static meth2");
	}
}
public class StaticOverrideDemo {
	public static void main(String[] args) {
		Super super1 = new Super();
		Super sub1 = new Sub();
		
		Sub pureSub = new Sub();
		pureSub.display("hey");
		
		Sub.method1();
		
		super1.display();//Super
		sub1.display();//Super will display bcz static method cannot override
		
		
		Super.display("Direct call with class name");
		Sub.display("Sub class calling Super class display(String) method as subclass inherit");
		
		
		Super super2 = new Sub();
		//super2.method2();
		Sub s = (Sub)super2; //here reference is downcasted
		
		//Sub sub2 = new Super();
		Sub s2 = new Sub();
		Super ss2 = (Super)s2; //here reference is upcasted
		
		
		s.display();
	}
}