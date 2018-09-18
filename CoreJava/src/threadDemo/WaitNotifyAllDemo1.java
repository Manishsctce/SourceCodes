package threadDemo;
import java.util.*;

class Printer implements Runnable{
	int count;
	List<String> singer ;
	Printer(){
		singer = new ArrayList<String>(10);
		singer.add("Lil Wayne");
		singer.add("Katy Perry");
		singer.add("Kenny Chesne");
		singer.add("Lady Gaga");
		singer.add("Lee Brice");
		singer.add("Taylor Swift");
		singer.add("Passenger");
		singer.add("chris Brown");
		singer.add("Enrique Iglesias");
		singer.add("Linkin Park");
	}
	public void run(){
		synchronized (this) {
			System.out.println(count+ ". Printer method to print");
			try {
				method1();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();
		}
	}
	
	void method1(){		
		int i = Math.round((float)(Math.random()*10));		
		System.out.println(singer.get(i));
	}
}

public class WaitNotifyAllDemo1 {
	static int count; 
	public static void main(String[] args) {
		Printer[] p = new Printer[10];
		
		for(int i=0;i<10;i++){
			p[i] = new Printer();
			p[i].count = i;
			new Thread(p[i]).start();
			synchronized (p[i]) {
				try {
					p[i].wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
