package zzJavaObjective;

class MyThreadClass implements Runnable{
	public void run() {
		System.out.println("InRun");		
	}
	
}
public class ThreadQuestion1 {
	public static void main(String[] args) {
		MyThreadClass myThreadClass = new MyThreadClass();
		new Thread(myThreadClass).start();
		myThreadClass.run();
		myThreadClass.run();
	}

}
