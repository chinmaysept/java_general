package com.algo.examples;

public class PalindromeUsingRecursion {

	private static Node left;
	 
    public boolean isPalindrome(Node head) {
        left = head;
 
        boolean result = helper(head);
        return result;
    }
 
    public boolean helper(Node right){
 
        //stop recursion
        if (right == null)
            return true;
 
        //if sub-list is not palindrome,  return false
        boolean x = helper(right.next);
        if (!x)
            return false;
 
        //current left and right
        boolean y = (left.data == right.data);
 
        //move left to next
        left = left.next;
 
        return y;
    }
    
    public static void main(String[] args) {
    	PalindromeUsingRecursion n1 = new PalindromeUsingRecursion();
    	n1.left = new Node(1);
		n1.left.next = new Node(2);
		n1.left.next.next = new Node(2);
		System.out.println(n1.isPalindrome(left));
	}
}
