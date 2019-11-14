package com.arraylist.example;

import com.beust.jcommander.internal.Lists;

//Java program to delete alternate nodes of a linked list
public class LinkedList {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteAlt() {
		if (head == null)
			return;

		Node prev = head;
		Node now = head.next;

		while (prev != null && now != null) {
			/* Change next link of previus node */
			prev.next = now.next;

			/* Free node */
			now = null;

			/* Update prev and now */
			prev = prev.next;
			if (prev != null)
				now = prev.next;
		}
	}

	public void swapNodes(int x, int y) {
		// Nothing to do if x and y are same
		if (x == y)
			return;

		// Search for x (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else
			// make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else
			// make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();

		/* Constructed Linked List is 1->2->3->4->5->null */
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		System.out.println("Swap nodes");
		llist.swapNodes(3, 2);
		System.out.println("After Swapping");
		llist.printList();
		
		System.out.println("Linked List before calling deleteAlt() ");
		llist.printList();

		llist.deleteAlt();

		System.out.println("Linked List after calling deleteAlt() ");
		llist.printList();
	}
}
