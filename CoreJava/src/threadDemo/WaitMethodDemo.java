package threadDemo;

public class WaitMethodDemo {

	public static void main(String[] args) {
		/*System.out.println("A");
		try{
			synchronized (args) {
				System.out.println("B");
				args.wait();
			}
		}catch(Exception e){
			
		}
		System.out.println("C");*/
		
		Object obj = new Object();
		
		synchronized (obj) {
			try {
				obj.wait(5);
				System.out.println("wait over");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.notify();
			System.out.println("Bye!!");
		}
	}

}
