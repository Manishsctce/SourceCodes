package thread.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {
	private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

     //Locking using Lock and ReentrantLock
     public int getCount() {
        lock.lock();
        
        try {
            System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            return count++;
        } finally {
            lock.unlock();
        }
     }

     //Implicit locking using synchronized keyword
     public synchronized int getCount2() {
    	 System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            return count++;
     }
     
    public static void main(String args[]) {
    //    final ThreadTest counter = new ThreadTest();
    	final ReentrantLockDemo1 counter = new ReentrantLockDemo1();
        Thread t1 = new Thread("t1") {

            @Override
            public void run() {
            	 
                while (counter.getCount() < 6) {
                    try {
                    	//temp = counter.getCount();
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();                    }
                }
            }
        };
      
        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                while (counter.getCount() < 6) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
      
        t1.start();
        t2.start();
      
    }
}
