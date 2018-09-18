package threadDemo;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("1 ");
		/* synchronized(args)
	        {
	            System.out.print("2 ");
	            try 
	            {
	                    args.wait();  Line 11 
	            }
	            catch(InterruptedException e){ 

	            }
	        }
	        System.out.print("3 ");*/

		Thread t = new Thread(){
			public void run(){
				while(true){
					System.out.println("Runninig");
				}

			}
		};
		t.start();
		try {

			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*while(true){
				System.out.println("Runninig2222");
			}*/
	}

}

class Server implements Runnable{ 
	private volatile boolean exit = false; 
	public void run() { 
		while(!exit){ 
			System.out.println("Server is running....."); 
		} 
		System.out.println("Server is stopped...."); 
	} 
	
	public void stop(){ 
		exit = true; 
	} 
}