package com.newjava4world.linklist;

import java.util.Scanner;

class CircularLinkedList{
	Node head;
	
	public int lengthCircularLinkedList(){
		int size = 1;
		Node currentNode = head;
		if(currentNode==null){
			size = 0;
		}
		else{			
			while(currentNode.getNext()!=head){
				currentNode = currentNode.getNext();
				size++;
			}				
		}			
		return size;
	}
	
	public void insertAtBeginning(int data){
		Node newNode = new Node(data);
		Node lastNode = head;
		if(head == null){
			head = newNode;
			head.setNext(head);
		}else{
			while(lastNode.getNext()!=head){
				lastNode = lastNode.getNext();
			}
			newNode.setNext(head);			
			lastNode.setNext(newNode);
			head = newNode;
		}			
	}
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		Node lastNode = head;
		if(head == null){
			head = newNode;
			head.setNext(head);
		}else{
			while(lastNode.getNext()!=head){
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
			newNode.setNext(head);
		}	
	}
	public void display(){
		Node currentNode = head;
		if(head==null){
			System.out.println("Circular linked list is empty");			
		}
		else{
			System.out.print("\n"+currentNode.getData()+" ");
			while(currentNode.getNext()!=head){
				currentNode = currentNode.getNext();
				System.out.print(currentNode.getData()+" ");
			}
		}
	}

	public void insertInMiddle(int toInsert, int position) {
		Node newNode = new Node(toInsert);
		int size = lengthCircularLinkedList();
		Node currentNode = head;
		Node previousNode = head;
		if(position>size+1 || position<1){
			System.out.println("Invalid position");
			return;
		}
		if(head==null && position == 1){
			head = newNode;
			head.setNext(head);
		}
		else{
			int count=1;
			if(position==1){
				Node lastNode = currentNode;
				while(lastNode.getNext()!=head){
					lastNode = lastNode.getNext();
				}
				newNode.setNext(currentNode);
				lastNode.setNext(newNode);
				head = newNode;
			}
			else{
				while(count<position){
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					count++;
				}
				previousNode.setNext(newNode);
				newNode.setNext(currentNode);
			}
		}		
	}

	public void deleteAtBeginning() {
		int size = lengthCircularLinkedList();
		Node lastNode = head;
		Node headNext = head;
		if(head==null){
			System.out.println("empty");
		}
		else{
			while(lastNode.getNext()!=head){
				lastNode = lastNode.getNext();
			}
			if(size==1){
				head = null;
			}
			else{
				headNext = head.getNext();				
				lastNode.setNext(headNext);
				head = headNext;
			}
		}		
	}

	public void deleteAtEnd() {
		int size = lengthCircularLinkedList();
		Node lastNode = head;
		Node previousLast = head;
		if(head==null){
			System.out.println("empty");
		}else{
			while(lastNode.getNext()!=head){
				previousLast = lastNode;
				lastNode = lastNode.getNext();
			}
			if(size==1){
				head = null;
			}else{
				previousLast.setNext(head);
				lastNode = null;
			}
		}		
	}

	public void deleteInMiddle(int position) {
		int size = lengthCircularLinkedList();
		Node currentNode = head;
		Node previousNode = head;
		if(position>size+1 || position<1){
			System.out.println("Invalid position");
			return;
		}
		
		if(position==1){
			if(size==1)
				head = null;
			else{
				Node lastNode = currentNode;
				Node headNext = head.getNext();
				while(lastNode.getNext()!=head){
					lastNode = lastNode.getNext();
				}
				lastNode.setNext(headNext);
				head = headNext;
			}
		}
		else{
			int count = 1;			
			while(count<position){
				previousNode = currentNode;
				currentNode  = currentNode.getNext();
				count++;
			}
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		
	}
	
	
}

public class CircularLinkedListDemo2 {
	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		int toInsert = 0;
		int position = 0;
		Scanner scan = new Scanner(System.in);
		char option = 'Y';
		while(option=='y'||option=='Y'){
			System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert In Middle");
			System.out.println("4. Delete At Beginning\n5. Delete At End\n6. Delete In Middle");
			System.out.println("7. Display length");
			switch(scan.nextInt()){
				case 1:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					circularLinkedList.insertAtBeginning(toInsert);
					break;
				case 2:
					System.out.println("Enter the data: ");
					toInsert = scan.nextInt();
					circularLinkedList.insertAtEnd(toInsert);
					break;
				case 3:
					System.out.println("Enter the data & position: ");
					toInsert = scan.nextInt();
					position = scan.nextInt();
					circularLinkedList.insertInMiddle(toInsert,position);
					break;
				case 4:					
					circularLinkedList.deleteAtBeginning();
					break;
				case 5:					
					circularLinkedList.deleteAtEnd();
					break;
				case 6:					
					System.out.println("Enter the position: ");				
					position = scan.nextInt();
					circularLinkedList.deleteInMiddle(position);
					break;
				case 7:
					System.out.println("Length of Circular linked list: "+circularLinkedList.lengthCircularLinkedList());
					break;
				default :
					break;
					
			}
			circularLinkedList.display();		
			System.out.println("\nDo you want to continue?(y/N)");
			option = scan.next().charAt(0);
		}


	}

}
