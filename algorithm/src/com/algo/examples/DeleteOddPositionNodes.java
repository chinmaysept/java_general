package com.algo.examples;

public class DeleteOddPositionNodes {

	private static Node node;
	private static Node tail;

	public void removeEvenPosNode(Node head) {
		Node curr = null;
		Node prev = head;
		int count = 0;
		while (prev.next != null) {
			if (prev != null && prev.next != null) {

				if (count % 2 != 0) {
					curr = prev.next;
					prev = curr.next;
					curr.next = prev.next;
					// }
				}
			}
			count++;
		}
		
		node = node.next;
		
	}

	public void printList() {
		Node temp = node;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DeleteOddPositionNodes n1 = new DeleteOddPositionNodes();
		n1.node = new Node(1);
		n1.node.next = new Node(4);
		n1.node.next.next = new Node(5);
		n1.node.next.next.next = new Node(9);
		n1.node.next.next.next.next = new Node(12);
		n1.node.next.next.next.next.next = new Node(13);
		n1.node.next.next.next.next.next.next = new Node(7);
		System.out.println("Before Removing the odd nodes");
		n1.printList();
		n1.removeEvenPosNode(node);
		System.out.println("After removing the odd nodes");
		n1.printList();

	}
}
