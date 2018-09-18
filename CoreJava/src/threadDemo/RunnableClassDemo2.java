package threadDemo;

public class RunnableClassDemo2 implements Runnable{
	public static void main(String[] args) {
		new Thread(new RunnableClassDemo2()).start();
	}
	public void run(){
		System.out.println("hello");
	}
}
