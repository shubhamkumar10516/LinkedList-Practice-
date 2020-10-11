package com.bridgelab.linkedListPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SortedLinkedListTest {

	@Test
	public void check3NodesLinkedInListTest1() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}

	@Test
	public void checkAdding3NodesToLinkedListTest2() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		SortedLinkedList sll = new SortedLinkedList();
		sll.add(myFirstNode);
		sll.add(mySecondNode);
		sll.add(myThirdNode);
		boolean test = myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode);
		assertTrue(test);
	}

	@Test
	public void checkAppending3NodesToLinkedListTest3() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}

	@Test
	public void checkInserting3NodesToLinkedListTest4() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(myThirdNode);
		llp.insert(mySecondNode, myFirstNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(test);
	}

	@Test
	public void checkDeletingFirstNodeFromLinkedListTest5() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = myFirstNode.equals(llp.pop());
		assertTrue(test);
	}

	@Test
	public void checkDeletingLastNodeFromLinkedListTest6() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = myThirdNode.equals(llp.popLast());
		assertTrue(test);
	}

	@Test
	public void searchByValueFromLinkedListTest7() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = llp.searchByValueInNode(30);
		assertTrue(test);
	}

	@Test
	public void checkInsertingNodeAfterNodeToLinkedListTest8() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		INode<Integer> nodeToInsert = new MyNode<Integer>(40);
		SortedLinkedList llp = new SortedLinkedList();
		llp.append(myFirstNode);
		llp.append(myThirdNode);
		llp.insert(mySecondNode, myFirstNode);
		llp.insert(nodeToInsert, mySecondNode);
		boolean test = mySecondNode.getNext().equals(nodeToInsert) && nodeToInsert.getNext().equals(myThirdNode);
		assertTrue(test);
	}

	@Test
	public void checkShowSizeByDeletingNodeInLinkedListTest9() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		INode<Integer> nodeToInsert = new MyNode<Integer>(40);
		SortedLinkedList llp = new SortedLinkedList();
		llp.add(myFirstNode);
		llp.add(mySecondNode);
		llp.add(myThirdNode);
		llp.insert(nodeToInsert, mySecondNode);
		boolean test = (3 == llp.showSizeByDeleting(40));
		assertTrue(test);
	}
	
	@Test
	public void sortedNodeAddLinkedListTest10() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		INode<Integer> myFourthNode = new MyNode<Integer>(40);
		SortedLinkedList sll = new SortedLinkedList();
		INode<Integer> head = sll.sortedAdd(myFirstNode);
		head = sll.sortedAdd(mySecondNode);
		head = sll.sortedAdd(myThirdNode);
		head = sll.sortedAdd(myFourthNode);
		boolean test = (30 == head.getData() && 40 == head.getNext().getData()
				       && 56 == head.getNext().getNext().getData() && sll.getTail().getData() == 70);
		assertTrue(test);
	}
	
	@Test
	public void stackPushTest() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		SortedLinkedList sll = new SortedLinkedList();
		INode<Integer> top = sll.push(myFirstNode);
		top = sll.push(mySecondNode);
		top = sll.push(myThirdNode);
		boolean test = myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode);
		assertTrue(test);
	}
	
	@Test
	public void stackPeekAndPopTest() {
		INode<Integer> myFirstNode = new MyNode<>(70);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(56);
		SortedLinkedList sll = new SortedLinkedList();
		INode<Integer> top = sll.push(myFirstNode);
		top = sll.push(mySecondNode);
		top = sll.push(myThirdNode);
		boolean test = 56 == sll.peek(top);
		assertTrue(test);
		top = sll.popStack();
		test = 30 == sll.peek(top);
		assertTrue(test);
		top = sll.popStack();
		test = 70 == sll.peek(top);
		assertTrue(test);
		
		
	}
}
