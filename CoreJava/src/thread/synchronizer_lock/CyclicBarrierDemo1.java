package thread.synchronizer_lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CyclicBarrierDemo1 {

	public static CyclicBarrier latch = new CyclicBarrier(5);
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		System.out.println("Start");
		IntStream.range(1, 6).forEachOrdered(i -> {
			executor.execute(new Thread(new RunnableThread2(latch,i), "T"+i));
		});
		
		
		IntStream.range(6, 10).forEachOrdered(i -> {
			new Thread(new RunnableThread2(latch,i), "T"+i).start();;
		});
		executor.shutdown();
		System.out.println("End");
	}
}

class RunnableThread2 implements Runnable {
	CyclicBarrier latch;
	int input;
	public RunnableThread2(CyclicBarrier latch, int input) {
		this.latch = latch;
		this.input = input;
	}
	
	public void run() {
		System.out.println("Processing thread : "+Thread.currentThread().getName() + " Out - "+ (int) ((Math.random()+input)*100));
		try {
			System.out.printf("\nBefore Await %s : Parties: %d  Waiting : %d\n", Thread.currentThread().getName(), latch.getParties(), latch.getNumberWaiting());
			int c = latch.await();
			System.out.printf("%s : Cyclic Barrier count is %d\n", Thread.currentThread().getName(), c);
			System.out.printf("\nAfter Await %s : Parties: %d  Waiting : %s\n", Thread.currentThread().getName(), latch.getParties(), latch.getNumberWaiting());
			if(c == 0) {
				latch.reset();
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
