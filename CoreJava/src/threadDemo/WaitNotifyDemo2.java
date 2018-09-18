package threadDemo;

import java.util.Scanner;
// this example not work as here thread t1 and t2 are tried to start again in a loop
//which is not possible

class P extends WaitNotifyDemo2 implements Runnable{
	//C c = new C();
	boolean flag=true;
	public synchronized void run(){										
		data++;
		System.out.println("Producer produce: "+data);					
		notify();			
	}
}

class C extends WaitNotifyDemo2 implements Runnable {
	public int product ;
	boolean flag  = true;
	public synchronized void run(){
		System.out.println("consumer consume: "+ data);
		notify();
	}
}
public class WaitNotifyDemo2 {
	static int data;
	public static void main(String[] args) {
		boolean flag = true;
		//int data = 0;
		P p = new P();
		C c = new C();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		while(flag){
			t1.start();
			try {
				synchronized (t1) {
					t1.wait();
				}				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t2.start();
			if(new Scanner(System.in).nextInt() == 0)
				flag = false;
		}


	}

}
