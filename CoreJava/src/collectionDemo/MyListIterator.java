package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class MyListIterator {
    public static void main(String a[]){
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);li.add(98);li.add(29);
        li.add(71);
        li.add(5);
        
        ListIterator<Integer> litr =li.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }//23,98,29, 71, 5
        //using next() and previous() pointer moves
        System.out.println("Now the current pointer is at "+litr.nextIndex());//5 i.e currentPointer+1
        
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("pointer is at: "+litr.next());
        System.out.println("Next Index :"+litr.nextIndex()+"Next Index value: "+litr.next());
       
        System.out.println("Previous Index :"+litr.previousIndex());
      
        
        
        System.out.println(litr.previous());
        /*while(litr.nextIndex()!= 4){
        	System.out.println(litr.nextIndex());
        }*/
        
        
    }
}