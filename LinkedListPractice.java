package com.bridgelab.linkedListPractice;

public class LinkedListPractice {

	private INode<Integer> head = null;
	private INode<Integer> tail;

	public LinkedListPractice() {
		tail = head;
	}

	// adding node at front
	public void add(INode<Integer> myNode) {
		if (tail == null)
			tail = myNode;
		if (head == null)
			head = myNode;
		else {
			myNode.setNext(head);
			head = myNode;
		}
	}

	// appending node at end
	public void append(INode<Integer> myNode) {
		if (tail != null) {
			tail.setNext(myNode);
			tail = myNode;
		} else if (tail == null) {
			tail = myNode;
			head = myNode;
		}
	}

	// insert node in middle
	public void insert(INode<Integer> myNode, INode<Integer> prevNode) {
		if (prevNode == null)
			add(myNode);
		myNode.setNext(prevNode.getNext());
		prevNode.setNext(myNode);
	}

}
