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

	// pop the first node
	public INode<Integer> pop() {
		if (head == null)
			return head;
		INode<Integer> deletedNode = head;
		head.setNext(head.getNext());
		return deletedNode;
	}

	// deleting last node
	public INode<Integer> popLast() {
		INode<Integer> deletedNode = tail;
		INode<Integer> temp = head;
		while (temp.getNext() != tail) {
			temp.setNext(temp.getNext());
		}
		tail = temp;
		return deletedNode;
	}
}
