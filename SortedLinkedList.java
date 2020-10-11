package com.bridgelab.linkedListPractice;

public class SortedLinkedList {

	private INode<Integer> head = null;
	private INode<Integer> tail;

	public INode<Integer> getHead() {
		return head;
	}

	public INode<Integer> getTail() {
		return tail;
	}

	public SortedLinkedList() {
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
			temp = temp.getNext();
		}
		tail = temp;
		tail.setNext(null);
		return deletedNode;
	}

	// Searching node with value
	public boolean searchByValueInNode(int val) {
		if (head == null)
			return false;
		INode<Integer> temp = head;
		while (temp != null) {
			if (temp.getData() == val)
				return true;
			temp = temp.getNext();
		}
		return false;
	}

	// delete by value and output size in end
	public int showSizeByDeleting(int val) {
		int size = 0;
		INode<Integer> temp = head;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		size = deleteNodeByVal(size, val);
		return size;
	}

	// delete by value
	public int deleteNodeByVal(int size, int val) {
		INode<Integer> temp = head;
		while (temp != null) {
			if (temp.getNext().getData() == val) {
				temp = temp.getNext().getNext();
				return size - 1;
			}
			temp = temp.getNext();
		}
		return size;
	}

	// sorting while adding
	public INode<Integer> sortedAdd(INode<Integer> myNode) {
		if (head == null) {
			head = myNode;
			tail = head;
			return head;
		}
		myNode.setNext(head);
		if (head.getData() < myNode.getData()) {
			int temp = head.getData();
			head.setData(myNode.getData());
			myNode.setData(temp);
		}
		head = myNode;
		return head;
	}

	// push operation on stack
	public INode<Integer> push(INode<Integer> myNode) {
		add(myNode);
		return head;
	}

	// peek operation
	public int peek(INode<Integer> top) {
		return top.getData();
	}

	// Pop operation on stack
	public INode<Integer> popStack() {
		head = head.getNext();
		return head;
	}

	// Enqueue operation in queue
	public void enqueue(INode<Integer> myNode) {
		append(myNode);
	}

	// Dequeue Operation in queue
	public INode<Integer> dequeue() {
		INode temp = head;
		head = head.getNext();
		return temp;
	}
}
