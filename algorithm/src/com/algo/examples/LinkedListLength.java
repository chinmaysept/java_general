package com.algo.examples;

public class LinkedListLength {
	private static Node node;
	
	public static void getLength(Node head) {
		int count = 0;
		
		while(head != null) {
			
			count++;
			head = head.next;
		
		}
		System.out.println("The length of LinkedList is: "+count);
	}
	
	public static void main(String[] args) {
		LinkedListLength n1 = new LinkedListLength();
		n1.node = new Node(1);
		n1.node.next = new Node(4);
		n1.node.next.next = new Node(5);
		n1.node.next.next.next = new Node(9);
		n1.node.next.next.next.next = new Node(12);
		n1.node.next.next.next.next.next = new Node(13);
		n1.node.next.next.next.next.next.next = new Node(7);
		getLength(node);
	}

}
