package linkedList;

import java.util.Scanner;

class DoubleLinkedList{
	DLLNode head;
	
	public int dllLength(){
		int size = 1;
		DLLNode currentNode = head;
		if(currentNode == null)
			return 0;
		while(currentNode.getNext()!= null){
			currentNode = currentNode.getNext();
			size++;
		}
		return size;
	}
	
	public void insertAtBeginning(int data){
		DLLNode newNode = new DLLNode(data);
		if(head !=null){
			newNode.setNext(head);
			head.setPrevious(newNode);			
		}			
		head = newNode;
	}
	
	public void insertAtEnd(int data){
		DLLNode newNode = new DLLNode(data);
		DLLNode currentNode = head;
		//DLLNode previousNode;
		int size = dllLength();
		int count=1;
		if(size == 0 )
			head = newNode;
		else{
			while(size>1){
				//previousNode = currentNode;
				currentNode = currentNode.getNext();
				size--;
			}
			currentNode.setNext(newNode);
			newNode.setPrevious(currentNode);
		}					
	}
	public void insertInMiddle(int data,int position){
		DLLNode newNode = new DLLNode(data);
		DLLNode currentNode = head;
		DLLNode previousNode = head;
		int size = dllLength();
		int count=1;
		if(position>size+1 || position<1){
			System.out.println("Invalid double linked list");
			return ;
		}
		if(position==1){
			newNode.setNext(currentNode);			
			if(currentNode!=null)
				currentNode.setPrevious(newNode);
			head = newNode;
		}
		else{
			while(count<position){
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				count++;
			}
			previousNode.setNext(newNode);
			newNode.setPrevious(previousNode);
			newNode.setNext(currentNode);
			
		}
		
	}
	public void display(){
		DLLNode currentNode = head;
		if(currentNode==null){
			System.out.println("Double Linked List is empty");
		}
		else{
			System.out.print(currentNode.getData()+ " ");
			while(currentNode.getNext()!= null) {
				currentNode = currentNode.getNext();
				System.out.print(currentNode.getData()+ " ");				
			}
		}
	}
}
public class DoubleLinkedListDemo1 {
	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		int toInsert = 0;
		int position = 0;
		Scanner scan = new Scanner(System.in);
		char option = 'Y';
		while(option=='y'||option=='Y'){
			System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert In Middle");
			System.out.println("4. Delete At Beginning\n5. Delete At End\n6. Delete In Middle\n7. Length of list");
			switch(scan.nextInt()){
				case 1:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					doubleLinkedList.insertAtBeginning(toInsert);
					break;
				case 2:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					doubleLinkedList.insertAtEnd(toInsert);
					break;
				case 3:
					System.out.println("Enter the data & position: ");
					toInsert = scan.nextInt();
					position = scan.nextInt();
					doubleLinkedList.insertInMiddle(toInsert,position);
					break;
				/*case 4:					
					doubleLinkedList.deleteAtBeginning();
					break;
				case 5:					
					doubleLinkedList.deleteAtEnd();
					break;
				case 6:					
					System.out.println("Enter the position: ");				
					position = scan.nextInt();
					doubleLinkedList.deleteInMiddle(position);
					break;*/
				case 7: 
					System.out.println("Length of List: "+ doubleLinkedList.dllLength());
					break;
				default :
					break;
					
			}
			doubleLinkedList.display();		
			System.out.println("\nDo you want to continue?(y/N)");
			option = scan.next().charAt(0);
		}

	}

}
