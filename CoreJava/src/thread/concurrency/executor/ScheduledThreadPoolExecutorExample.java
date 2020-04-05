package thread.concurrency.executor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
 
public class ScheduledThreadPoolExecutorExample
{
    public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        Task task1 = new Task ("Demo Task 1");
        Task task2 = new Task ("Demo Task 2");
         
        System.out.println("The time is : " + new Date());
         
        //executor.schedule(task1, 5 , TimeUnit.SECONDS);
        //executor.schedule(task2, 10 , TimeUnit.SECONDS);
        ScheduledFuture<?> result = executor.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);
        
       // ScheduledFuture<?> result = executor.scheduleWithFixedDelay(task1, 2, 5, TimeUnit.SECONDS);
        
        try {
              executor.awaitTermination(3, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
         
        executor.shutdown();
    }
}

class Task implements Runnable
{
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run()
    {
        try {
        	int delay = (int)(Math.random()*10000);
        	Thread.sleep(delay);
            System.out.println("Doing a task during : " +delay+ " : "+ name + " - Time - " + new Date());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
