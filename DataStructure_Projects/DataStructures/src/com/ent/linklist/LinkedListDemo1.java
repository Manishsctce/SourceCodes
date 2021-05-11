package com.ent.linklist;

import java.util.Scanner;

class LinkedList{
	private Node start;
	private Node end;
	private int size;
	
	public LinkedList() {
		this.start = null; this.end = null; this.size = -1;
	}

	public boolean isEmpty(){
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtBeginning(Object obj){
		Node newNode = new Node(obj);
		
		if(start == null){
			start = newNode;
			end = start;
		}
		else{
			newNode.setNext(start);
			start = newNode;			
		}
		size++;
		
	}
	
	public void insertAtEnd(Object obj){
		Node newNode = new Node(obj);
		if(start == null){
			start = newNode;
			end = start;
		}
		else{
			end.setNext(newNode);
			end = newNode;
		}
		this.size++;
	}
	
	public void insert(Object obj){
		Node newNode = new Node(obj);		
	}
	
	public void display(LinkedList linkedList){
		Node node = null;
		if(linkedList.isEmpty()){
			System.out.println("Linked list is Empty");
		}
		else{
			node = linkedList.start;
			do{
				System.out.print(node.getData()+" -> ");
				node = node.getNext();
				if(node.getNext()==null)
					System.out.print(node.getData());
			}while(node.getNext() != null);													
		}
	}
}

public class LinkedListDemo1 {
	protected static int toplist[];
	public static void main(String[] args) {
		
		int numberOfElement = 0;
		String data = null;
		System.out.println("Enter the number of element: ");
		Scanner scan = new Scanner(System.in);		
		numberOfElement = Integer.parseInt(scan.next());
		System.out.println("You have entered "+numberOfElement);
		
		LinkedList linkedList = new LinkedList();
		for(int i=0;i<numberOfElement;i++){
			System.out.println("Please insert the data : ");
			data = scan.next();
			linkedList.insertAtEnd(data);
		}
		System.out.println("LinkedList form: ");
		linkedList.display(linkedList);
	}
	
}
