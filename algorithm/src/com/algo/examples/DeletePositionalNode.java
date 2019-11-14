package com.algo.examples;

public class DeletePositionalNode {
	
	private static Node head;
	
	private void deletePosNode(Node node, int n) {
		Node curr = node;
		
		if(node == null) 
			return;
		
		if(n == 0) {
			node = curr.next;
			return;
		}
		
		for(int i = 1; i<n-1 && node != null; i++) {
			node = node.next;
		}
		
		if(node == null && node.next == null) {
			return;
		}
		
		curr = node.next.next;
		node.next = curr;
	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DeletePositionalNode n1 = new DeletePositionalNode();
		n1.head = new Node(1);
		n1.head.next = new Node(4);
		n1.head.next.next = new Node(5);
		n1.head.next.next.next = new Node(9);
		n1.head.next.next.next.next = new Node(12);
		n1.head.next.next.next.next.next = new Node(13);
		n1.head.next.next.next.next.next.next = new Node(7);
		System.out.println("Before removing positional node");
		n1.printList();
		System.out.println("After removing positional node");
		System.out.println(" ");
		n1.deletePosNode(head, 4);
		n1.printList();
		
	}
}
