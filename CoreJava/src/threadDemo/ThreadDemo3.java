package threadDemo;

class NormalClass extends Thread{
	volatile int counter ;
	NormalClass(int counter){
		this.counter = counter;
	}
	public synchronized void run(){
		
		for(int i=0;i<10;i++)
			System.out.println("Counter"+counter+": "+i);
	 notify();
	}
}

public class ThreadDemo3 {
	static int counter ;
	public static void main(String[] args) {
		NormalClass nc[] = new NormalClass[10];
		//NormalClass n2 = new NormalClass();
		
		for(int i=0;i<9;i++){
			//counter = i;
			nc[i] = new NormalClass(i);
			synchronized (nc[i]) {
				nc[i].start();
				try {
					nc[i].wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
