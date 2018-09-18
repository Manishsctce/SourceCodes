package threadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(5);
		e.execute(new Thread(){
			public void run(){
				System.out.println("thread1");
			}
		});
		e.execute(new Thread(){
			public void run(){
				System.out.println("thread2");
			}
		});
		e.shutdown();
	}

}
