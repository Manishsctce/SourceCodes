package threadDemo;
/* join() - Sequencial execution of program
 * it pause the current thread execution until the specified thread is dead 
 */
public class SequentialExecutionDemo1 {
	private int count=0;
	public static void main(String[] args) {
		SequentialExecutionDemo1 threadDemo3 = new SequentialExecutionDemo1();
		threadDemo3.doWork();
	}
	
	public void doWork(){
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<11;i++){
					//System.out.println(count++);
					System.out.println("t1: "+i);
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		 Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<15;i++){
					//System.out.println(count++);
					System.out.println("t2: "+i);
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});	
		t1.start();
		//Below block mean t2 will start only if t1 dead or complete it 4.8sec
		try {
			t1.join(4800);//wait till t1 kill or complete its sec
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread t2 is about to start. It thread t1 alive "+t1.isAlive());		
		t2.start();
		
		//below block mean count will show only if t2 is dead or complete
		try {
			t2.join(6000);//wait till t2 kill
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count is: "+count); // here count value will never more than 1000 
		

		System.out.println("Count is: "+count);
	}

}
