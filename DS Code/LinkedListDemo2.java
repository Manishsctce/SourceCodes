package linkedList;

import java.util.Scanner;

class SingleLinkedList{
	Node head;
	public int length(){
		int size = 0;
		Node temp = head;
		if(temp == null)
			return 0;
		else{
			size++;
			while(temp.getNext()!=null){
				size++;
				temp = temp.getNext();			
			}
		}
		return size;
	}
	
	public void insertAtBeginning(int data){
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else{
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		Node currentNode = head;
		int size =0;
		if(head == null)
			head = newNode;
		else{
			size = length();
			while(size>1){
				size--;
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}
	
	public void insertInMiddle(int data,int position){
		Node newNode = new Node(data);
		Node currentNode = head;
		int size =0;
		if(head == null)
			head = newNode;
		else{
			size = length();
			if(position>size+1 || position < 1)
				System.out.println("Invalid position");
			else{
				while(position>2){
					position--;
					currentNode = currentNode.getNext();
				}
			newNode.setNext(currentNode.getNext());	
			currentNode.setNext(newNode);
			}
		}
	}
	
	public void deleteAtBeginning(){
		int size = 0;
		if(head==null)
			System.out.println("List is Empty");		
		else
			head = head.getNext();						
	}
	
	public void deleteAtEnd(){
		int size = 0;
		Node currentNode = head;
		Node previousNode = head;		
		if(head==null)
			System.out.println("List is Empty");
		else{
			size = length();
			if(size==1){
				System.out.println("Deleted data: "+currentNode.getData());
				head = null;
			}
			else{
				while(size>1){
					previousNode = currentNode;
					currentNode = currentNode.getNext();				
					size--;
				}
				System.out.println("Deleted data: "+currentNode.getData());
				currentNode = null;
				previousNode.setNext(currentNode);
			}
		}	
	}
	
	public void deleteInMiddle(int position){
		int size = 0;int count = 1;
		Node currentNode = head;
		Node previousNode = head;
		if(head==null)
			System.out.println("List is Empty");
		else{
			size = length();
			if(position<1 || position>size+1){
				System.out.println("Invalid position, cannot delete");
			}
			if(position==1){
				currentNode = currentNode.getNext();
				head = currentNode;
			}
			else{				
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				while(count < position){
					count++;
					previousNode = currentNode;
					currentNode = currentNode.getNext();
				}
			}				
			
			System.out.println("Deleted data: "+currentNode.getData());
			currentNode = null;
			previousNode.setNext(currentNode);
		}			
	}
	
	public void display(){
		if(head == null)
			System.out.println("Linked list is empty");
		else{
			Node temp = head;
			System.out.print("\n"+temp.getData()+" ");
			while(temp.getNext()!=null){
				temp = temp.getNext();
				System.out.print(temp.getData()+" ");
			}
		}			
	}
}

public class LinkedListDemo2 {

	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		int toInsert = 0;
		int position = 0;
		Scanner scan = new Scanner(System.in);
		char option = 'Y';
		while(option=='y'||option=='Y'){
			System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert In Middle");
			System.out.println("4. Delete At Beginning\n5. Delete At End\n6. Delete In Middle");
			switch(scan.nextInt()){
				case 1:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					singleLinkedList.insertAtBeginning(toInsert);
					break;
				case 2:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					singleLinkedList.insertAtEnd(toInsert);
					break;
				case 3:
					System.out.println("Enter the data & position: ");
					toInsert = scan.nextInt();
					position = scan.nextInt();
					singleLinkedList.insertInMiddle(toInsert,position);
					break;
				case 4:					
					singleLinkedList.deleteAtBeginning();
					break;
				case 5:					
					singleLinkedList.deleteAtEnd();
					break;
				case 6:					
					System.out.println("Enter the position: ");				
					position = scan.nextInt();
					singleLinkedList.deleteInMiddle(position);
					break;
				default :
					break;
					
			}
			singleLinkedList.display();		
			System.out.println("\nDo you want to continue?(y/N)");
			option = scan.next().charAt(0);
		}
	}

}
