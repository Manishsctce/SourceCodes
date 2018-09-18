package threadDemo;
/* Runnable interface 
 * TPD we cannot re-initialize terminated thread
 */
class RunnableClass  extends Thread implements Runnable{
	public void run(){
		System.out.println("Hello");
	}
}

public class ThreadUsingRunnableInterfaceDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableClass());
		t1.start();
		System.out.println(t1.getName()+" : "+t1.isAlive());
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getName()+" : "+t1.isAlive());
		//t1.start();//java.lang.IllegalThreadStateException
	}
}
