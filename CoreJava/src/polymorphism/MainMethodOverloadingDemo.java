package polymorphism;

public class MainMethodOverloadingDemo {
	public static void main(String[] args) {
		Integer str[] = {4,5};
		System.out.println("In Main String args");
		main(str);
		
	}
	public static void main(Integer i) {
		System.out.println("Hello "+i);
	}
	public static void main(Object o) {
		System.out.println("Hello "+o);
	}
}
