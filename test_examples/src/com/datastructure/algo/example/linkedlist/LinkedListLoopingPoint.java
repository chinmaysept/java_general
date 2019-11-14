package com.datastructure.algo.example.linkedlist;


public class LinkedListLoopingPoint {
	
	public static boolean hasLoop(LinkedListNode root){
	    if(root == null) return false;

	    LinkedListNode slow = root, fast = root;
	    int taken = 0, limit = 2;

	    while (fast.next != null) {
	        fast = fast.next;
	        taken++;
	        if(slow == fast) return true;

	        if(taken == limit){
	            taken = 0;
	            limit <<= 1;    // equivalent to limit *= 2;
	            slow = fast;    // teleporting the turtle (to the hare's position) 
	        }
	    }
	    return false;
	}


}
