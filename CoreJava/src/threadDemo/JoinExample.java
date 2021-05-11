package threadDemo;

public class JoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnablee(), "t1");
        Thread t2 = new Thread(new Runnable() { public void run() {
        	System.out.println("Thread :::"+Thread.currentThread().getName());               
        }}, "t2");
        
        Thread t4 = new Thread(()-> System.out.println("Thread :::"+Thread.currentThread().getName()), "t4");
        
        Thread t3 = new Thread(new Runnable() {public void run() {
        	System.out.println("Thread started:::"+Thread.currentThread().getName());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("asdfasdfasdfThread ended:::"+Thread.currentThread().getName());
        }}, "t3");
        
        t1.start();
        
        //start second thread after waiting for 2 seconds or if it's dead
        try {
        	t1.interrupt();
            t1.join(0000);
        	//t1.join();
        	
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
        
        //start third thread only when first thread is dead
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t3.start();
        
        //let all threads finish execution before finishing main thread
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("All threads are dead, exiting main thread");
    }

}
class MyRunnablee implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
    
}
