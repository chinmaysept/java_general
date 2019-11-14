package com.datastructure.algo.example.linkedlist;

public class DeleteEvenDataLinkedList {

	void deleteEven(NodeList head) {
	    NodeList tmpHead = new NodeList(0, null);
	    NodeList tmpCopy = tmpHead;
	    NodeList tmp = head;
	    while (tmp != null) {
	        if (tmp.data % 2 == 1) {
	            tmpCopy.next = tmp;
	            tmpCopy = tmpCopy.next;
	        }
	        tmp = tmp.next;
	    }
	    tmpCopy.next = null;
	    head = tmpHead.next;
	    System.out.println("head value..."+head.data);
	}
	
	public static void main(String[] args) {
		NodeList l1 = new NodeList(1, null);
		l1.next = new NodeList(3, null);
		l1.next.next = new NodeList(6,null);
		DeleteEvenDataLinkedList l2 = new DeleteEvenDataLinkedList();
		l2.deleteEven(l1);
		
	}
}

class NodeList {
	int data;
	NodeList next;
	
	public NodeList(int data, NodeList next) {
		this.data = data;
		this.next = next;
	}
}
