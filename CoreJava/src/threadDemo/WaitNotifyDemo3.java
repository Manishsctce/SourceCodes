package threadDemo;

import java.util.*;

/*
 * wait() tells the calling thread to give up the monitor and 
 * go to sleep until some other thread enters the same monitor and calls notify( ).
 */
 
class Goods{
	//List good = new ArrayList();
	Map<Integer,Integer> good = new HashMap<Integer,Integer>();
	boolean flag = false;
	
	synchronized void add(Integer goodname,Integer producer) throws InterruptedException{
		if(flag)
			wait();
		good.put(goodname,producer);
		//flag = true;
		
	}
	
	synchronized void get()throws InterruptedException{
		if(!flag)
			wait();
		
		Set<Map.Entry<Integer, Integer>> set = good.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = set.iterator();
		if(itr.hasNext()){
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			itr.remove();
		}
		else{
			System.out.println("map empty");
		}		
		notifyAll();
	}
}

class Producer1 implements Runnable{
	Goods g ;
	Producer1(Goods g){
		this.g=g;
	}
    public void run(){
    	for(int i=0;i<5;i++){
    		try {
    			System.out.println("P1 added"+i);
				g.add(i, 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
    	}
    	g.flag = true;
    }
}
class Producer2 implements Runnable{
	Goods g ;
	Producer2(Goods g){
		this.g=g;
	}
    public void run(){
    	for(int i=5;i<5;i++){
    		try {
    			System.out.println("P2 added"+i);
				g.add(i, 2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
    	}
    	g.flag = true;
    }
}
class Consumer1 implements Runnable{
	Goods g ;
	Consumer1(Goods g){
		this.g=g;
	}
    public void run(){
    	while(g.good.size()>0){
    		try {
				g.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	g.flag = false;
    }
}

public class WaitNotifyDemo3 {	
	public static void main(String[] args) {
		Goods g = new Goods();
		Producer1 p1 = new Producer1(g);
		Producer2 p2 = new Producer2(g);
		Consumer1 c1 = new Consumer1(g);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		Thread t3 = new Thread(c1);
		t3.start();
		//Goods g = new Goods();
/*		g.add(1, 1);
		g.add(2, 2);
		g.add(3, 3);
		g.add(4, 4);
		g.add(5, 5);
		
		g.get();
*/		
		//System.out.println("Size of map"+g.good.size());
	}

}