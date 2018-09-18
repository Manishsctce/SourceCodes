package com.newjava4world.linklist;

class Node {
	private Object data;
	private Node next;	
	
	public Node(){ 
		this.data = null;
		this.next = null;
	}
	public Node(Object data){
		this.data = data;
		this.next = null;
	}
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}	
	Object getData() {
		return data;
	}
	void setData(Object data) {
		this.data = data;
	}
	Node getNext() {
		return next;
	}
	void setNext(Node next) {
		this.next = next;
	}	
}
