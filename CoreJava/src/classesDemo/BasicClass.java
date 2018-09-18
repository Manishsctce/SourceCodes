package classesDemo;

public class BasicClass {
	
	BasicClass(){
		this("manish");
	}
	BasicClass(String name){
		//this();
		System.out.println("Hi, "+name);
		return ;
	}
	
	public void greet(){
		
	}
	public static void main(String[] args) {
		new BasicClass();
		SubClass2 sc = new SubClass2();
		sc.BasicClass("yo yo");
	}
}

class SubClass2 extends BasicClass{
	void BasicClass(String name){
		System.out.println("Hi2, "+name);
	}
}