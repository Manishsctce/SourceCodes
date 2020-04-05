package thread.concurrency.executor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService e = Executors.newFixedThreadPool(5);
		Runnable task1 = () -> System.out.println("thread1");
		e.execute(task1);

		e.execute(new Thread(){
			public void run(){
				System.out.println("thread2");
			}
		});
		e.shutdown();
		
		//================================
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
	    executor.submit(new Runnable() {

	        @Override
	        public void run() {
	            while (true) {
	            	System.out.println("Thread is running");
	                if (Thread.currentThread().isInterrupted()) {
	                    System.out.println("interrupted");
	                    break;
	                }
	            }
	        }
	    });

	    Thread.sleep(50);
	    //executor.shutdown();
	    executor.shutdownNow();
	    if (!executor.awaitTermination(1000, TimeUnit.MICROSECONDS)) {
	        System.out.println("Still waiting after 100ms: calling System.exit(0)...");
	        System.exit(0);
	    }
	    System.out.println("Exiting normally...");

	    //================================================================
	    
		//Demo task
	    Runnable runnableTask = () -> {
	        try {
	            TimeUnit.MILLISECONDS.sleep(1000);
	            System.out.println("Current time :: " + LocalDateTime.now());
	        } catch (InterruptedException e1) {
	            e1.printStackTrace();
	        }
	    };
	     
	    //Executor service instance
	    ExecutorService executor1 = Executors.newFixedThreadPool(10);
	     
	    //1. execute task using execute() method
	    executor1.execute(runnableTask);
	     
	    //2. execute task using submit() method
	    Future<String> result = executor1.submit(runnableTask, "DONE");
	     
	    while(result.isDone() == false)
	    {
	        try
	        {
	            System.out.println("The method return value : " + result.get());
	            break;
	        }
	        catch (InterruptedException | ExecutionException e1)
	        {
	            e1.printStackTrace();
	        }
	         
	        //Sleep for 1 second
	        try {
	            Thread.sleep(1000L);
	        } catch (InterruptedException e1) {
	            e1.printStackTrace();
	        }
	    }
	    
	    //Shut down the executor service
		executor1.shutdownNow();
	}
}
