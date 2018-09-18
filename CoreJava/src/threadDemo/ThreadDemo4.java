package threadDemo;
// Use of wait() for sequencial flow of thread
class RunnerThread implements Runnable {

	public void run() {
		try{
		for(int i=0;i<5;i++){
			System.out.println("Hello "+i+ " "+Thread.currentThread().getName());
			Thread.currentThread().sleep(115);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class ThreadDemo4 {
	public static void main(String[] args) {
		RunnerThread r = new RunnerThread();
		RunnerThread r2 = new RunnerThread();
		Thread t1 = new Thread(r,"T1");
		Thread t2 = new Thread(r,"T2");
		t1.start();
		try {
			synchronized (t1) {
				t1.wait();
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			synchronized (t2) {
				t2.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
