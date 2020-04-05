package thread.synchronizer_lock;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class CountDownLatchDemo1 {

	public static CountDownLatch latch = new CountDownLatch(5);
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Start");
		IntStream.range(1, 6).forEachOrdered(i -> {
			new Thread(new RunnableThread(latch,i), "T"+i).start();;
		});
		latch.await();
		System.out.println("End");
	}

}

class RunnableThread implements Runnable {
	CountDownLatch latch;
	int input;
	public RunnableThread(CountDownLatch latch, int input) {
		this.latch = latch;
		this.input = input;
	}
	
	@Override
	public void run() {
		System.out.println("Processing thread : "+Thread.currentThread().getName());
		 
		System.out.println("Latch Count: "+latch.getCount());
		int out = (int) ((Math.random()+input)*100);
		 System.out.println("## "+out);
		 latch.countDown();
	}
	
}
