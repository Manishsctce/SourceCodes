package threadDemo;
//Synchronization

//Can we synchronize the constructor of a Java Class? No
//Can we synchronize the run method? If yes then what will be the behavior?
//Can two threads call two different synchronized instance methods of an Object?
//Can a thread call a non-synchronized instance method of an Object when a synchronized method is being executed ?
public class ThreadDemo5 {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();

		synchronized(b){
			try{
				System.out.println("Waiting for b to complete...");
				b.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}

			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread{
	int total;
	ThreadB(){}
	@Override
	public void run(){
		synchronized(this){
			for(int i=1; i<=10 ; i++){
				total += i;
				System.out.println(i);
			}
			notify();
		}
	}
}



