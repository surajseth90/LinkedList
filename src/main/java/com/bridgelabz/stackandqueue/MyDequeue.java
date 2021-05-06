package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;
public class MyDequeue {
	private MyLinkedList myLinkedList;
	
	public MyDequeue() {
		this.myLinkedList = myLinkedList;
	}

	public INode pop ()
	{
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNode();
		
	}

	public INode peak() {
	return myLinkedList.head;
		
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
		
	}

	
}
