package threadDemo;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThreadLocalExample implements Runnable{

    // SimpleDateFormat is not thread-safe, so give one to each thread
//    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
//        @Override
//        protected SimpleDateFormat initialValue(){
//            return new SimpleDateFormat("yyyyMMdd HHmm");
//        }
//    };
    
	//SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmm");
    
    static Map<Integer, SimpleDateFormat> formatter = new HashMap<>();
    
    @Override
    public void run() {
        //System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
        //System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+format.toPattern());
    	System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get(1).toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        formatter.put(1, new SimpleDateFormat("yyyyMMdd"));
        //format.applyPattern("yyyyMMdd");
        
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get(1).toPattern());
        //System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+format.toPattern());
    }
    
    public static void main(String[] args) throws InterruptedException {
    	
    	formatter.put(1, new SimpleDateFormat("yyyyMMdd HHmm"));
    	
        ThreadLocalExample obj = new ThreadLocalExample();
        for(int i=0 ; i<10; i++){
            Thread t = new Thread(obj, ""+i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }
}
