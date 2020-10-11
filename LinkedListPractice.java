package com.bridgelab.linkedListPractice;

public class LinkedListPractice {
	
	private INode<Integer> head = null;
	private INode<Integer> tail;
	public LinkedListPractice() {
		tail = head;
	}
	public void add(INode<Integer> myNode) {
		if(tail == null)
			tail = myNode;
		if(head == null)
			head = myNode;
		else {
			myNode.setNext(head);
			head = myNode;
		}
	}
}


