package com.ent.linklist;
/*
 *  Java Program to Implement Circular Singly nexted List
 */
 
import java.util.Scanner;
  
/* Class nextedList */
class MyLinkedList
{
    protected Node start ;
    protected Node end ;
    public int size ;
 
    public MyLinkedList()
    {
        start = null; end = null; size = 0;
    }
    public boolean isEmpty() {return start == null;} 
    
    public int getSize() { return size; }

    public void insertAtStart(int val){
        Node nptr = new Node(val,null);    
        nptr.setNext(start);
        if(start == null){            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else{
            end.setNext(nptr);
            start = nptr;        
        }
        size++ ;
    }
    
    /* Function to insert element at end */
    public void insertAtEnd(int val){
        Node nptr = new Node(val,null);    
        nptr.setNext(start);
        if(start == null){            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else{
            end.setNext(nptr);
            end = nptr;            
        }
        size++ ;
    }
    
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos) {
        Node nptr = new Node(val,null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp = ptr.getNext() ;
                ptr.setNext( nptr );
                nptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++ ;
    }
    
    /* Function to delete element at position */
    public void deleteAtPos(int pos){    
        if (size == 1 && pos == 1){
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (pos == 1){
            start = start.getNext();
            end.setNext(start);
            size--; 
            return ;
        }
        
        //If position is at the end
        if (pos == size){
            Node iterTillEnd = start;
            Node secondLast = start;
            while (iterTillEnd != end){
                secondLast = iterTillEnd;
                iterTillEnd = iterTillEnd.getNext();
            }
            end = secondLast;
            end.setNext(start);
            size --;
            return;
        }
        
        //If position is any where in between
        Node ptr = start;
        pos = pos - 1 ;//before position
        for (int i = 1; i < size - 1; i++){
            if (i == pos){
                Node nextToPosition = ptr.getNext().getNext();;
                ptr.setNext(nextToPosition);
                break;
            }
            ptr = ptr.getNext();
        }
        size-- ;
    }
    
    /* Function to display contents */
    public void display(){
        System.out.print("\nCircular Singly Nexted List = ");
        Node ptr = start;
        if (size == 0){
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == start){
            System.out.print(start.getData()+ "->"+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "->");
        ptr = start.getNext();
        while (ptr.getNext() != start){
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
    }
}
 
/* Class CircularSinglyNextedList */
public class CircularLinkedListDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        /* Creating object of NextedList */
        MyLinkedList list = new MyLinkedList(); 
        System.out.println("Circular Singly nexted List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nCircular Singly nexted List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                //list.ins
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');           

	}

}
