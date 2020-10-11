package com.bridgelab.linkedListPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LinkedListPracticeTest 
{
    
    @Test
    public void add3NodesSingleLinkedListTest1()
    {
    	MyNode<Integer> myFirstNode = new MyNode<>(56);
    	MyNode<Integer> mySecondNode = new MyNode<>(30);
    	MyNode<Integer> myThirdNode = new MyNode<>(70);
    	myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean test = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        assertTrue( test );
    }
}
