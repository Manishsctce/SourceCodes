package interfaceDemo;

interface A{
	String name="Manish";
	void method1();
}
interface B{
	String title="Agrawal";
	String noname="";
	void method1();
}
class C implements A,B{
	String noname="something";
	@Override
	public void method1() {
		System.out.println("C" + noname);
		System.out.println(C.name+" "+C.title);
	}
}
public class ImplementMultipleInterfaceDemo {

	public static void main(String[] args) {
		A a = new C();
		a.method1();
		
		B b = new C();
		b.method1();
	}

}
