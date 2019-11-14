package com.datastructure.algo.example.linkedlist;

public class LinkedListMergePoint {
	
	int FindMergeNode(LinkedListNode headA, LinkedListNode headB) {
		LinkedListNode tempA = headA;
		LinkedListNode tempB = headB;
		int countA = 0;
		int countB = 0;
	        // finding the longer linked list.
		while (tempA.next != null) {
			tempA = tempA.next;
			countA++;
		}
		while (tempB.next != null) {
			tempB = tempB.next;
			countB++;
		}
		LinkedListNode temp1 = null;
		LinkedListNode temp2 = null;
		LinkedListNode temp = null;
	        // connect the tail of the longer linked list to the head of the longer link list.
		if (countA > countB) {
			tempA.next = headA;
			temp1 = headB;
			temp2 = headB;
			temp = headB;
		} else {
			tempB.next = headB;
			temp1 = headA;
			temp2 = headA;
			temp = headA;
		}
	        
	        // start two pointers from the head of the shorter linked list to find where they meet in the cycle
		do {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		} while (temp1 != temp2);
	 
	        // reset one of the pointers to the head of the shorter linked list and move both the pointers one step at a time.
		while (temp != temp1) {
			temp = temp.next;
			temp1 = temp1.next;
		}
	        // return the new node where both the pointers meet now.
		return temp1.data;
	}
}
