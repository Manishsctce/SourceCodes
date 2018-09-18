package threadDemo;
/*
 * If a Runnable object is passed to the Thread constructor, then 
 * the run method of the Thread class will invoke the run method of the Runnable object.
 */
class MyThread extends Thread{
	Runnable runnable;
	public MyThread() { }
	public MyThread(MyRunnable myRunnable) {
		this.runnable = myRunnable;
	}
	
	public void run(){
		runnable.run();
	}
}

class MyRunnable implements Runnable{
	public void run(){
		System.out.println("Hello this is runnable class run method");
	}
}

public class RunnableClassDemo1 {
	public static void main(String[] args) {
		new MyThread().start(); // will not give any op
		//new MyThread(new MyRunnable()).start();
		
		MyRunnable myRunnable = new MyRunnable();
		MyThread myThread1 = new MyThread(myRunnable);
		
		//myThread1.start();
		Thread t1 = new Thread(myRunnable);
		//t1.start();
	}
}
