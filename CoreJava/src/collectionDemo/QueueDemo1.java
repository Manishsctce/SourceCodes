package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyQueue{
	LinkedList que = new LinkedList();
	
	public void enqueue(int data){
		que.addLast(data);
	}
	
	public Object deque(){
		return que.poll();
	}
	
	
	public void display(){
		Iterator it = que.iterator();
		while(it.hasNext())
			System.out.println(it.next() + " ");
	}
}

public class QueueDemo1 {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		
		System.out.println("MyQueue :");
		myQueue.display();
		
		System.out.println("MyQueue after 1 pop: "+ myQueue.deque());
		myQueue.display();
	}

}
