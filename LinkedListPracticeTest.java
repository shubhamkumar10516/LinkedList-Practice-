package com.bridgelab.linkedListPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListPracticeTest {

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
		LinkedListPractice llp = new LinkedListPractice();
		llp.add(myFirstNode);
		llp.add(mySecondNode);
		llp.add(myThirdNode);
		boolean test = myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode);
		assertTrue(test);
	}

	@Test
	public void checkAppending3NodesToLinkedListTest3() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		LinkedListPractice llp = new LinkedListPractice();
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
		LinkedListPractice llp = new LinkedListPractice();
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
		LinkedListPractice llp = new LinkedListPractice();
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
		LinkedListPractice llp = new LinkedListPractice();
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
		LinkedListPractice llp = new LinkedListPractice();
		llp.append(myFirstNode);
		llp.append(mySecondNode);
		llp.append(myThirdNode);
		boolean test = llp.searchByValueInNode(30);
		assertTrue(test);
	}

	@Test
	public void checkInserting3NodesToLinkedListTest8() {
		INode<Integer> myFirstNode = new MyNode<>(56);
		INode<Integer> mySecondNode = new MyNode<>(30);
		INode<Integer> myThirdNode = new MyNode<>(70);
		INode<Integer> nodeToInsert = new MyNode<Integer>(40);
		LinkedListPractice llp = new LinkedListPractice();
		llp.append(myFirstNode);
		llp.append(myThirdNode);
		llp.insert(mySecondNode, myFirstNode);
		llp.insert(nodeToInsert, mySecondNode);
		boolean test = mySecondNode.getNext().equals(nodeToInsert) && nodeToInsert.getNext().equals(myThirdNode);
		assertTrue(test);
	}
}
