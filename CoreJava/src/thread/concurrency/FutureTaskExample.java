package thread.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {

	public static void main(String[] args) {
		MyCallable c1 = new MyCallable("callable1");
		MyCallable c2 = new MyCallable("callable2");
		MyCallable c3 = new MyCallable("callable3");
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<MyCallable> myl = new ArrayList<>();
		myl.add(c1);
		
		FutureTask<String> f1 = new FutureTask<String>(c1);
		Future<String> f2 = new FutureTask<>(c2);
		es.execute(f1);
		boolean checkStatus = false;
		while(!checkStatus)
		if(f1.isDone()){
			try {
				System.out.println("Future Returns:"+f1.get());
				es.shutdown();
				checkStatus =true;
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}

class MyCallable implements Callable<String>{
	
	private String str;
	MyCallable(String str){
		this.str = str;
	}
	
	@Override
	public String call() throws Exception {
		return this.str;
	}	
}