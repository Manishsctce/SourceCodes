package modifier;

public abstract class AbstractDemo1 {
	public AbstractDemo1() {
		System.out.println("Abstract class constructor");
	}
	
	public AbstractDemo1(String str) {
		System.out.println("Abstract class constructor overloading" + str);
	}
	public static void main(String[] args) {
		System.out.println("hello this is abstract class");
		
	}

}
