package threadDemo;
/* WAIT AND NOTIFY METHOD
 * this is sequential execution of thread using wait and notify method
 * 
 * wait() tells the calling thread to give up the monitor and 
 * go to sleep until some other thread enters the same monitor and calls notify( ).
 */

/*class Resource{
	int count=0;
	synchronized void counter(){
		for(int i=0;i<20;i++){
			count++;
			if(count==10){
				notify();
			}
		}
	}
}*/
class Runner implements Runnable{
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	synchronized public void run() {
		int count = 0;
		System.out.println("Runner class run method "+count+ " ");
		for(int i=0;i<10;i++,count++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		System.out.println("Runner class run method "+count+ " ");
		notify();
	}
}

public class WaitNotifyDemo1 {
	public static void main(String[] args) {
		Runner runner1 = new Runner();
		Thread t1 = new Thread(runner1,"Thread1");
		t1.start();
		
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("statement after thread1 wait method");
		
		Thread t2 = new Thread(runner1,"Thread2");
		t2.start();
/*		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
