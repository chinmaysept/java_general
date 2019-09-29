package com.algo.examples;

public class ReverseTheLinkedList {
	
	private static Node headLinkedList;
	
	public static Node reverse(Node head) {
		Node curr = head;
		Node next = null;
		Node prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
		return head;
	}
	
	public void printList() {
		Node temp = headLinkedList;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseTheLinkedList rev = new ReverseTheLinkedList();
		 rev.headLinkedList = new Node(1);
		 rev.headLinkedList.next = new Node(2);
		 rev.headLinkedList.next.next = new Node(3);
		 rev.headLinkedList.next.next.next = new Node(4);
		 rev.headLinkedList.next.next.next.next = new Node(5);
		 rev.printList();
		headLinkedList = rev.reverse(headLinkedList);
		System.out.println(headLinkedList.data);
		 rev.printList();
		 
	}
}
