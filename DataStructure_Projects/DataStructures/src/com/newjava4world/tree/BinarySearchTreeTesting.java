package com.newjava4world.tree;

import java.util.Scanner;

class BinarySTree{
	private Node root;
	private static int countl=0;
	private static int countr=0;
	/*{
		root  = new Node(50);
		root.setLeft(new Node(30));
		root.setRight(new Node(80));
	}*/
	public void insert(int data){

		root = insertdata(root, data);	
	}
	public Node insertdata(Node node, int data){
		//Node temp;
		if(node == null){			
			node = new Node(data);
		}
		else{
			if(data > node.getData()){
				node.setRight(insertdata(node.getRight(), data));
			}
			else{
				node.setLeft(insertdata(node.getLeft(), data));
			}
		}		
		return node;
	}
	public void display(){
		display(root);
	}
	public void display(Node node){	
		if(node!=null){
			System.out.print(node.getData()+" ");
			display(node.getLeft());
			display(node.getRight());
		}		
	}
	public boolean search(int data){
		if(root == null){
			System.out.println("Tree is empty");
			return false;
		}		
		 return  search(root,data);
	}
	public boolean search(Node node, int data) {
		boolean flag = false;
		if(node.getData()==data){
			flag = true;
			return flag;
		}
		else if(node.getData() < data){ //right
			if(node.getRight()!=null)
				flag = search(node.getRight(),data);
		}
		else{
			if(node.getLeft()!=null)
				flag = search(node.getLeft(),data);
		}
		return flag;
	}
	
	public void delete(int data){
		//if(root.getData())
	}

}

public class BinarySearchTreeTesting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of BST */
		BinarySTree bt = new BinarySTree();
		
		System.out.println("Binary Search Tree Test\n");          
		char ch;
		/*  Perform tree operations  */
		System.out.println("\nBinary Search Tree Operations\n");
		do    
		{			
			System.out.println("1. insert\t2. delete\t3.Search");
			int choice = scan.nextInt();            
			switch (choice)
			{
			case 1 : 
				System.out.println("Enter integer element to insert");
				bt.insert( scan.nextInt() );                
				break;                          
			case 2 : 
				System.out.println("Enter integer element to delete");
				//bt.delete( scan.nextInt() );                     
				break;                 
			case 3 :
				System.out.println("Enter element to search: ");
				System.out.println("element availability: "+bt.search(scan.nextInt()));;
				break;
			default : 
				System.out.println("Wrong Entry");
				break;   
			}
			/*  Display tree  */ 
			System.out.print("\nPre order : ");
			bt.display();

			System.out.println("\nDo you want to continue (Type y or n): ");
			ch = scan.next().charAt(0);                        
		} while (ch == 'Y'|| ch == 'y');

	}

}
