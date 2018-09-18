package zzJavaObjective;

class Test7a{
	Test7a(){
		System.out.println("Parent class constructor");
	}
}
class Test7b extends Test7a{
	{
		System.out.println("Sub class initializer block");
	}
}
public class Question7 extends Test7a{
	{
		System.out.println("Sub class initializer block");
	}
	public static void main(String[] args) {
		Test7b test7b = new Test7b(){
			public void display(){
				System.out.println("Anonymous class display method");
			}			
		};

	}

}
