package com.newjava4world.linklist;

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

	public void deleteAtBeginning() {
		int size = dllLength();
		DLLNode headNext;
		if(head == null){
			System.out.println("DLL is empty");
		}
		else{
			if(size ==1)
				head = null;
			else{
				headNext = head.getNext();
				head = headNext;
			}				
		}
	}

	public void deleteAtEnd() {
		int size = dllLength();
		DLLNode lastNode = head;
		DLLNode previousNode = head;
		if(head == null){
			System.out.println("DLL is empty");
		}
		else{
			if(size ==1)
				head = null;
			else{
				while(lastNode.getNext()!=null){
					previousNode = lastNode;
					lastNode = lastNode.getNext();
				}
				previousNode.setNext(null);
				lastNode = null;
			}
		}
		
	}

	public void deleteInMiddle(int position) {
		int size = dllLength();
		DLLNode previousNode = head;
		DLLNode currentNode = head;
		if(position<1 || position>size){
			System.out.println("Invalid position");
			return;
		}
		if(position ==1){
			DLLNode headNext;
			if(size ==1)
				head = null;
			else{
				headNext = head.getNext();
				headNext.setPrevious(null);
				head = headNext;
			}
		}
		else{
			int count = 1;
			while(count<position){
				previousNode = currentNode;
				currentNode= currentNode.getNext();
				count++;
			}
			if(currentNode.getNext()!=null)
				currentNode.getNext().setPrevious(previousNode);
			previousNode.setNext(currentNode.getNext());			
			currentNode=null;
		}
	}
}
public class DoubleLinkedListDemo1 {
	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		int toInsert = 0;
		int position = 0;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		char option = 'Y';
		while(option=='y'||option=='Y'){
			System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert In Middle");
			System.out.println("4. Delete At Beginning\n5. Delete At End\n6. Delete In Middle\n7. Length of list");
			choice = scan.nextInt();
			if(choice>7 || choice<1)
				System.out.println("Invalid choice");
			switch(choice){
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
				case 4:					
					doubleLinkedList.deleteAtBeginning();
					break;
				case 5:					
					doubleLinkedList.deleteAtEnd();
					break;
				case 6:					
					System.out.println("Enter the position: ");				
					position = scan.nextInt();
					doubleLinkedList.deleteInMiddle(position);
					break;
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
