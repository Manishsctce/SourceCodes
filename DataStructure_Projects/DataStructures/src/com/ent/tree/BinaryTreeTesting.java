package com.ent.tree;

import java.util.*;

class MyQueue{
	LinkedList<Node> que = new LinkedList<Node>();
	public void enqueue(Node node){
		que.addLast(node);
	}

	public Node deque(){
		return que.poll();
	}

	public boolean isEmpty(){
		return que.isEmpty();
	}
	public void display(){
		Iterator it = que.iterator();
		while(it.hasNext())
			System.out.println(it.next() + " ");
	}
}


class BTree{
	Node root;

	public void insert(int data) {
		 insert(root,data);
	}
	//pg119
	public void insert(Node node,int data){
		Node newnode = new Node(data);
		MyQueue myQueue = new MyQueue(); 
		if(node==null){
			root = newnode;
			return;
		}
		else{
			myQueue.enqueue(node);
			
			while(!myQueue.isEmpty()){				
				Node qnode = myQueue.deque();
				
				if(qnode.getLeft()!=null)
					myQueue.enqueue(qnode.getLeft());
				else{
					qnode.setLeft(newnode);
					myQueue.deque();
					return;
				}
				if(qnode.getRight()!=null)
					myQueue.enqueue(qnode.getRight());
				else{;
					qnode.setRight(newnode);
					myQueue.deque();
					return;
				}
			}
		}
	}
	
	public boolean search(int data){
		boolean flag = false;
		Node temp;
		MyQueue q = new MyQueue();
		if(root==null){
			System.out.println("Empty tree");
			return flag;
		}
		else{
				q.enqueue(root);
				while(!q.isEmpty()){
					temp = q.deque();
					if(temp.getData()==data){
						flag = true;
						return flag;
					}	
					if(temp.getLeft()!=null)
						q.enqueue(temp.getLeft());
					if(temp.getRight()!=null)
						q.enqueue(temp.getRight());
				}	
		}
		return flag;
	}
	public void LevelOrderTranversal(){
		int count=0;
		Node temp;
		Node node = root;
		MyQueue q = new MyQueue();
		if(node==null){
			System.out.println("Tree is empty");
		}
		else{
			q.enqueue(node);
			
			while(!q.isEmpty()){
				temp = q.deque();
				count++;
				System.out.print(temp.getData()+ " ");
				if(temp.getLeft()!=null)
					q.enqueue(temp.getLeft());
				
				if(temp.getRight()!=null)
					q.enqueue(temp.getRight());
			}
		}
		System.out.println("Size of Tree is "+count);
	}
	public void preorder(){
		preorder(root);
	}
	public void preorder(Node node) {
		if(node!=null){
			System.out.print(node.getData()+" ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}

	}
	
	public void nonRecursivePreOrderTraversal(){
		nonRecursivePreOrderTraversal(root);
	}
	public void nonRecursivePreOrderTraversal(Node node){
		Node temp;
		Stack<Node> stack = new Stack<Node>();
		if(node == null)
			System.out.println("Tree is empty");
		else{
			stack.push(node);
			while(!stack.isEmpty()){
				temp = stack.pop();
				System.out.print(temp.getData() +" ");
				if(temp.getLeft()!=null)
					stack.push(temp.getLeft());
				else{ 
					temp = stack.pop();
					if(temp.getRight()!=null)
						stack.push(temp.getRight());
				}				
			}
			
		}
	}
	
	public void LevelOrderTraversalInReverse(){
		LevelOrderTraversalInReverse(root);
	}
	private void LevelOrderTraversalInReverse(Node node){
		Node temp;
		MyQueue q = new MyQueue();
		Stack<Node> stack = new Stack<Node>();
		if(node==null)
			System.out.println("Empty tree");
		else{
			q.enqueue(node);
			while(!q.isEmpty()){
				temp = q.deque();
				if(temp.getLeft()!=null)
					q.enqueue(temp.getLeft());
				if(temp.getRight()!=null)
					q.enqueue(temp.getRight());
				stack.push(temp);
			}
			while(!stack.isEmpty()){
				System.out.print(stack.pop().getData()+" ");
			}
		}
	}
	//height of the binary tree
	public void heightOfTree(){
		int level = -1;
		MyQueue myQueue = new MyQueue();
		Node temp;
		if(root==null)
			System.out.println("empty tree");
		
		else{
			myQueue.enqueue(root);
			myQueue.enqueue(null);
			while(!myQueue.isEmpty()){
				temp = myQueue.deque();				
				if(temp==null){
					if(!myQueue.isEmpty())
						myQueue.enqueue(null);
					level++;
				}
				else{
					if(temp.getLeft()!=null)
						myQueue.enqueue(temp.getLeft());					
					if(temp.getRight()!=null)
						myQueue.enqueue(temp.getRight());
					
				}					
			}
		}
		System.out.println("Height Size: "+level);
	}
	
	public void heightOfNode(int data){
		int level = -1;
		MyQueue myQueue = new MyQueue();
		Node temp;
		Node node = null;
		
		if(root==null){
			System.out.println("tree is empt");
		}
		else{
			System.out.print("Height of node "+node.getData());
			if(root.getData()==data)
				level = 0;
			else {
				
			}
			myQueue.enqueue(node);
			myQueue.enqueue(null);
			while(!myQueue.isEmpty()){
				temp = myQueue.deque();				
				if(temp==null){
					if(!myQueue.isEmpty())
						myQueue.enqueue(null);
					level++;
				}
				else{
					if(temp.getLeft()!=null)
						myQueue.enqueue(temp.getLeft());					
					if(temp.getRight()!=null)
						myQueue.enqueue(temp.getRight());
					
				}					
			}
		}
		System.out.print(" is: "+level+"\n");
	}
	
	
	public void delete(int data){
		
	}
}

public class BinaryTreeTesting {
	public static void main(String[] args) {
		//int treevalues[] = new int[10];
		int treevalues[] = {1,2,3,4,5,6,7};
		BTree bt = new BTree();
		char option = 'Y';
		while(option == 'Y' || option == 'y'||option == '1'){
			System.out.println("1. Create\t2. Delete\t3.Search\n4. Node height");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			switch(choice){
			case 1:
				System.out.print("Creating tree with given array: ");
				for(int i=0;i<treevalues.length;i++){
					bt.insert(treevalues[i]);
				}				
				break;
			case 2:
				System.out.print("\nEnter the element to delete: ");
				break;
			case 3:
				System.out.print("\nEnter the element to search: ");
				boolean f = bt.search(scan.nextInt());
				System.out.println("Node present: "+f);;
				break;
			case 4:
				System.out.println("Enter the node for height: ");
				bt.heightOfNode(scan.nextInt());
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
			bt.preorder();
			System.out.print("\nDo you want to continue? ");
			option = scan.next().charAt(0);
			
		}
		System.out.println("Level Tranversal: ");
		bt.LevelOrderTranversal();
		
		System.out.println("\n Reversal Order Traversal: ");
		bt.LevelOrderTraversalInReverse();
		
		System.out.println("##Height");
		bt.heightOfTree();
	}

}
