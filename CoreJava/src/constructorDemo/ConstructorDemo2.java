package constructorDemo;

class Parent{
	private int a;
	public Parent(){
		System.out.println("hello parent constructor");
	}
	//constructor does not have return type
	/*void Parent(){
		System.out.println("Hello void parent method");
	}*/
	void Parent1(){
		System.out.println("Hello void parent");
	} 
	Parent(int a){
	//	this();
		this.a = a;
		System.out.println("parameterize ");
	}
}
class Child extends Parent{
	void Parent(String str){
		
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Parent p = new Parent(4);
		//p.Parent();

	}

}
