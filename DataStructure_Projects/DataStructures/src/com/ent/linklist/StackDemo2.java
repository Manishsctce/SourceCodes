package com.ent.linklist;

import java.util.Scanner;

class Stack2{
	Node top;
	Node head;
	
	public int stackLength(){
		int length=0;
		Node currentNode = head;
		if(currentNode==null){
			length = 0;
		}
		else{
			length=1;
			while(currentNode.getNext()!=null){
				currentNode = currentNode.getNext();
				length++;
			}
		}		
		return length;
	}
	
	public void push(int data){
		Node newNode = new Node(data);		
		if(top==null){
			top = newNode;
			head = top;
		}
		else{
			top.setNext(newNode);
			top = newNode;
		}			
	}
	
	public Object pop(){
		Object data = null;
		int length = stackLength();
		Node currentNode = head;
		Node previousNode = head;
		if(length==0){
			System.out.println("Stack is empty");
			//return -1;
		}
		else{
			while(currentNode.getNext()!=null){
				previousNode= currentNode;
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext()==null){
				data = currentNode.getData();
				previousNode = null;
			}
			data = currentNode.getData();
			top = previousNode;	
				
		}
		return data;
	}
	
	public void display(){
		Node currentNode = head;
		int length = stackLength();		
		if(length == 0){
			System.out.println("Stack is empty");
			return;
		}
		else{
			System.out.println(currentNode.getData()+" ");
			while(currentNode!=top){
				currentNode = currentNode.getNext();
				if(currentNode!=null)
					System.out.print(currentNode.getData()+" ");
			}
		}
		
	}
}

public class StackDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Stack2 stack = new Stack2();
		char option = 'Y';
		while(option=='y' || option=='Y'){
			System.out.println("1. Push 2. Pop 3. Length");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the data: ");
				int data = scan.nextInt();
				stack.push(data);
				break;
			case 2:
				System.out.println("Deleted Item: "+stack.pop());
				break;
			case 3:
				System.out.println("Length: "+stack.stackLength());
				break;				
			default:
				break;
			}
			stack.display();
			System.out.print("\nDo you want to continue(y/n)?");
			option = scan.next().charAt(0);
		}
	}

}
