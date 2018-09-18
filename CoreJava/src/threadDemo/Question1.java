package threadDemo;

/*I have to create 5 threads where each thread has to perform the addition operation. 
Thread1 - Add 1 to 10 
Thread2 - Add 1 to 50 
Thread3 - Add 5 to 15 
Thread4 - Add 10 to 20 
Thread5 - Add 15 to 20 
What is the best way to accomplish this? 
 * 
 */

class Addition implements Runnable{
	static int name;
	int limit;
	int start;
	int sum = 0;
	Addition(int start, int limit){
		this.start = start;
		this.limit = limit;
		name++;
	}

	public void run() {
		System.out.print("\nThread"+name+": ");
		for(int i=start;i<limit;i++){
			sum = sum+i;
			System.out.print(sum+" ");
		}
		
	}	
}

public class Question1 {
	public static void main(String[] args) {
		Addition a1 = new Addition(0,10);
		Thread t1 = new Thread(a1);
		t1.start();
		
		Addition a2 = new Addition(11,20);
		Thread t2 = new Thread(a2);
		t2.start();
		
		Addition a3 = new Addition(21,30);		
		Thread t3 = new Thread(a3);
		t3.start();
		
		Addition a4 = new Addition(31,40);
		Thread t4 = new Thread(a4);
		t4.start();
		
		Addition a5 = new Addition(41,50);
		Thread t5 = new Thread(a5);
		t5.start();
	}

}
