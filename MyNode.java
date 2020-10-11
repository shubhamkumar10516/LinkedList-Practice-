package com.bridgelab.linkedListPractice;

public class MyNode<T> implements INode<T> {

	private T data;
	private INode<T> next;

	public MyNode(T data) {
		this.data = data;
		next = null;
	}

	public INode<T> getNext() {
		return next;
	}

	public void setNext(INode<T> myNode) {
		this.next = myNode;
	}

	public void setData(T d) {
		data = d;
	}

	public T getData() {
		return data;
	}
}
