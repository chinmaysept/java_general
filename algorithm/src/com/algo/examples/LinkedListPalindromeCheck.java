package com.algo.examples;

public class LinkedListPalindromeCheck {
	
	private static Node head;
	
	public boolean isPalindrome(Node head) {
	    if(head == null)
	        return true;
	 
	    Node p = head;
	    Node prev = new Node(head.data);
	 
	    while(p.next != null){
	        Node temp = new Node(p.next.data);
	        temp.next = prev;
	        prev = temp;
	        p = p.next;
	    }
	 
	    Node p1 = head;
	    Node p2 = prev;
	 
	    while(p1!=null){
	        if(p1.data != p2.data)
	            return false;
	 
	        p1 = p1.next;
	        p2 = p2.next;
	    }
	 
	    return true;
	}
	
	//Traversing from middle
	public boolean isPalindrome1(Node head) {
		 
	    if(head == null || head.next==null)
	        return true;
	 
	    //find list center
	    Node fast = head;
	    Node slow = head;
	 
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	 
	    Node secondHead = slow.next;
	    slow.next = null;
	 
	    //reverse second part of the list
	    Node p1 = secondHead;
	    Node p2 = p1.next;
	 
	    while(p1!=null && p2!=null){
	        Node temp = p2.next;
	        p2.next = p1;
	        p1 = p2;
	        p2 = temp;
	    }
	 
	    secondHead.next = null;
	 
	    //compare two sublists now
	    Node p = (p2==null?p1:p2);
	    Node q = head;
	    while(p!=null){
	        if(p.data != q.data)
	            return false;
	 
	        p = p.next;
	        q = q.next;
	 
	    }
	 
	    return true;
	}
	
	public static void main(String[] args) {
		LinkedListPalindromeCheck n1 = new LinkedListPalindromeCheck();
		n1.head = new Node(1);
		n1.head.next = new Node(2);
		n1.head.next.next = new Node(1);
//		n1.head.next.next.next = new Node(9);
//		n1.head.next.next.next.next = new Node(12);
//		n1.head.next.next.next.next.next = new Node(13);
//		n1.head.next.next.next.next.next.next = new Node(7);
		System.out.println("Check for Palindrome");
		System.out.println(n1.isPalindrome(head));
	}

}
