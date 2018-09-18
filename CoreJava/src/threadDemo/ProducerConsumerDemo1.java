package threadDemo;
/* producer/consumer problem*/

//Q, the queue that you're trying to synchronize;
class Q {
	int n;	
	boolean valueSet = false;
	synchronized void get() throws InterruptedException{
		if(!valueSet)
			wait();
		System.out.println("Got :"+n);
		Thread.sleep(1000);
		valueSet = false;
		notify();
	}
	
	synchronized void put() throws InterruptedException{
		if(valueSet)
			wait();
		System.out.println("Put : "+(++n));
		Thread.sleep(1000);
		valueSet = true;
		notify();	
	}
}
//Producer, the threaded object that is producing queue entries
class Producer implements Runnable{
	Que q ;
	Producer(Que q){
		this.q = q;
		new Thread(this,"Producer").start();
	}
	public void run() {
		while(true) {
			try {
				q.put();
			} catch (InterruptedException e) {e.printStackTrace();}
		}					
	}	
}
//Consumer, the threaded object that is consuming queue entries
class Consumer implements Runnable{
	Que q;
	public Consumer(Que q) {
		this.q = q;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		while(true)
			try {
				q.get();
			} catch (InterruptedException e) {e.printStackTrace();}		
	}
}
public class ProducerConsumerDemo1 {
	public static void main(String args[]){	
		Que q = new Que();
		Producer2 producer = new Producer2(q);
		Consumer2 consumer = new Consumer2(q);
		System.out.println("Hello");
	}
}
