package threadDemo;


class Even2 implements Runnable{
	int i=0;
	Object MUTEX = null;
	volatile boolean flag = true;
	
	Even2(Object MUTEX){
		this.MUTEX = MUTEX;
	}

	public void run() {
		synchronized (MUTEX) {
			try {
				while(i<50){
					if(flag){
						System.out.println("Even:"+ i);
						i = i+1; flag=false;
						MUTEX.notify();
					}else{
						flag=true;
						i+=1;  
						MUTEX.wait();
					}
				}					
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}	
}

class Odd2 implements Runnable{
	int i=1;
	Object MUTEX = null;
	Odd2(Object MUTEX){
		this.MUTEX = MUTEX;
	}
	volatile boolean flag = false;
	public void run() {
		synchronized (MUTEX) {
			try {
				while(i<50 ){
					if(!flag){
						System.out.println("Out:"+ i);				
						i = i+1; flag=true;
						MUTEX.wait();
					}else{
						flag=true;
						i+=1;
						MUTEX.notify();
					}
				}					
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}	
}
public class EvenOddDemo1 {

	public static void main(String[] args) {
		Object obj = new Object();
		Thread t1 = new Thread(new Even2(obj));
		Thread t2 = new Thread(new Odd2(obj));

		t1.start();
		t2.start();
	}

}
