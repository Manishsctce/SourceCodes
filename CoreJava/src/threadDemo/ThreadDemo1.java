package threadDemo;
/* Different way of creating thread
 * Thread class doesnot contain abstract run(). So it is not necessary to implement
 */
//1 -way
class Runner1 extends Thread {
	public void run(){
		try {
			for(int i=0;i<5;i++){
				System.out.println("R1 "+this.getName() + " Thread :"+i );			
				Thread.sleep(100);
				System.out.println(this.getPriority());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//2-way preferably use
//run() is required
class Runner2 implements Runnable{
	public void run(){
		try {
			for(int i=0;i<6;i++){
				//System.out.println(this.getName()+ " Thread :"+i); getName() is not in the Runnable interface 
				System.out.println("R2 Thread :"+i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Runner4 extends Thread implements Runnable{

}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		runner1.start();
		
		Runner2 runner2 = new Runner2();
		//runner2.start();// we cann't call thread method like this, which are make by implementing Runnable interface
		new Thread(runner2).start();//we need thread object to call runnable class
		
		//3rd way
		new Thread(
				new Runnable(){
					public void run(){
						try {
							for(int i=0;i<7;i++){
								System.out.println("R3 Thread :"+i);			
								Thread.sleep(100);
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
		
		System.out.println("Thread class run method");
		new Thread().start();
		
		Runner4 runner4 = new Runner4();
		runner1.run();
		System.out.println("R4 "+runner1.getName());
}
}