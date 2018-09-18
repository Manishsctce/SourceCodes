package collectionDemo.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo1 {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(5);
		bq.add("Manish");
		bq.put("Manish");
		
		
		System.out.println(bq);

	}

}
