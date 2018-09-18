package classesDemo;

public class AnonymousClassDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread() 
        {
            Foo f = new Foo(){
            	 public void increase(int amt) {            	                    	        
            	   System.out.println("Anonymous inner class of Foo, overriden increase method :"+amt+100);
            	 }
            };
            public void run(){
                f.increase(20);//43
            }            
        };
    t.start();
        
    }
}
class Foo 
{
    private int data = 23;
    public void increase(int amt) 
    {
        int x = data;
        data = x + amt;
        System.out.println(data);
    }
}