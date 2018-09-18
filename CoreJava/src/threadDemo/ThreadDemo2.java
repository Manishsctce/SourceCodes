package threadDemo;
import java.util.ArrayList;
import java.util.Scanner;
/* test volatile variable 
 * 
 */

class Processor extends Thread{
	//static boolean running = true;
	static volatile boolean running = true;
	public void run(){
		while(running){
			System.out.println("Hello");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void shutdown(){
		running = false;
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press C to stop..");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();		
		if(str.substring(0, 1).equalsIgnoreCase("C")){
			proc1.shutdown();
		}
		

		
	}

}
