package threadDemo;

class A extends Thread{
	/*public void start(){
		System.out.println("Hello start method");
	}*/
	
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println("runner :"+i);
	}
}

public class StartRunMethod1 {

	public static void main(String[] args) {
		 A a = new A();
		 a.start();

	}

}
