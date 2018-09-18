package collectionDemo;
import java.util.*;
import java.util.Collection;

public class DisplayCollection {
	public static void display(Collection col){		
	/*	Iterator i = col.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		
		//using for loop
		for(Object object: col){
			System.out.println(object);
		}						
	}
	public static void displayInLine(Collection col){
		for(Iterator i = col.iterator();i.hasNext();){
			System.out.print(i.next()+"  ");
		}
	}
}
