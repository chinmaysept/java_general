package com.datastructure.algo.example.linkedlist;

public class LinkedListNode {
	LinkedListNode next;
	int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
