package com.ent.linklist;

public class DLLNode {
	private DLLNode next;
	private DLLNode previous;
	private Object data;
	
	public DLLNode() {
	}
	public DLLNode(Object data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public DLLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
