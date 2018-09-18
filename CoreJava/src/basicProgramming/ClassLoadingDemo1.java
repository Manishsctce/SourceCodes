package basicProgramming;

public class ClassLoadingDemo1 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.main();
		System.out.println("This is main class");

	}
}

class Child1{
	Child1(){
		System.out.println("child 1 class");
	}
	void main(){
		int i;
		for(i=0;i<10;i++){
			
		}
		System.out.println("child1 class method: "+i);
	}
}