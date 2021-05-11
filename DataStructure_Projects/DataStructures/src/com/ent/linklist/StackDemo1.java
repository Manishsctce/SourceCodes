package com.ent.linklist;

import java.util.*;

//USING ARRAY


class Stack1{
	int top = -1;
	int capacity = 0;
	Object arr[];
	Stack1(){}
	Stack1(int capacity){
		this.capacity = capacity;
		arr = new Object[capacity];
	}
	
	public void push(int data){
		if(top==capacity-1){
			System.out.println("Stack overflow");
			return;
		}
		else{
			top++;
			arr[top] = data;
		}
	}
	
	public Object pop(){
		Object var;
		if(top== -1){
			System.out.println("Stack is empty");
			return -1;
		}		
		else{
			var = arr[top];
			arr[top] = null;
			top = top -1;
		}
		return var; 
	}
	
	public void display(){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null)
				break;
			System.out.print(arr[i]+" ");
		}		
	}
}
public class StackDemo1 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the capacity of Stack: ");
		int capacity = scan.nextInt();
		
		Stack1 stack = new Stack1(capacity);
		char option = 'Y';
		while(option=='y' || option=='Y'){
			System.out.println("1. Push 2. Pop");
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
			default:
				break;
			}
			stack.display();
			System.out.print("\nDo you want to continue(y/n)?");
			option = scan.next().charAt(0);
		}
		
	}

}
