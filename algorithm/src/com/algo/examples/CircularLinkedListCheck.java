package com.algo.examples;

public class CircularLinkedListCheck {
	static Node node;
	
	public void printList() {
		Node temp = node;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static boolean hasCycle(Node head) {
	    if (head == null || head.next == null) {
	        return false;
	    }
	    Node slow = head;
	    Node fast = head.next;
	    while (slow != fast) {
	        if (fast == null || fast.next == null) {
	            return false;
	        }
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return true;
	}

	public static void main(String[] args) {
		CircularLinkedListCheck check = new CircularLinkedListCheck();
       // Node head = null;
        check.node = new Node(1);
        check.node.next = new Node(2);
        check.node.next.next = new Node(3);
        check.node.next.next.next = new Node(4);
        check.printList();
	    System.out.print(hasCycle(node)? "Yes\n" : 
	                    "No\n" ); 
	  
	    // Making linked list circular 
	    check.node.next.next.next = node;
	    
	    System.out.print(hasCycle(node)? "Yes\n" : 
	                    "No\n" ); 
		 
	}

}


