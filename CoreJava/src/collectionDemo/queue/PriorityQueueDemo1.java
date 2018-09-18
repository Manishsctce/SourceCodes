package collectionDemo.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>(); //priority queue are in natural order
		
		pq.add("M");pq.add("A");pq.add("N");pq.add("I");pq.add("S");pq.add("S");
		pq.add("D");pq.add("B");
		//pq.add(null);//does not permit  null elements
		
		//iterator doesn't guarantee to traverse in particular order. 
		//For order traverse use Arrays.sort(pq.toArray());
		Iterator<String> iterator = pq.iterator(); 
		while(iterator.hasNext()){
			System.out.print(iterator.next());//ABDISSNM 
		}
		System.out.println("");
		
		for (int i = 0,tran=pq.size(); i < tran; i++) {
			System.out.print(pq.poll()+" ");
		}
		
		
		System.out.println(pq);
	}

}
