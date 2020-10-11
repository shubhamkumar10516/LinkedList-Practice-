package com.bridgelab.linkedListPractice;

public class MyNode<T> {

	private T data;
	private MyNode<T> next;

	public MyNode(T data) {
		this.data = data;
		next = null;
	}

	public MyNode<T> getNext() {
		return next;
	}
	
	public void setNext(MyNode<T> myNode) {
		this.next = myNode;
	}
	
	public T getData() {
		return data;
	}
}
