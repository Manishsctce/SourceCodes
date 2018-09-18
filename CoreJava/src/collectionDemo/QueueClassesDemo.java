package collectionDemo;
import java.util.ArrayDeque;
import java.util.Iterator;
public class QueueClassesDemo {

	public static void main(String[] args) {
		//Queue classes ArrayDeque and PriorityQueue
		// Create a tree set.
		ArrayDeque<String> adq = new ArrayDeque<String>();
		// Use an ArrayDeque like a stack.
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.print("Popping the stack: ");
		while(adq.peek() != null)
		System.out.print(adq.pop() + " ");
		System.out.println();
		
		Iterator<String> i = adq.iterator();
		System.out.println(i.hasNext());
		while(i.hasNext())
			System.out.println(i);
		}
	}


