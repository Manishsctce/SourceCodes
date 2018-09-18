package threadDemo;

class DaemonThread implements Runnable{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(i);
		}
	}
}
public class DaemonThreadDemo1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new DaemonThread());
		t1.setDaemon(true);
		t1.setPriority(10);
		t1.run();

	}

}
