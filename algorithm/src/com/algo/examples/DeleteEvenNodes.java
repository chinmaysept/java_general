package com.algo.examples;

public class DeleteEvenNodes {
  private static Node node;
   
	public  void printList() {
		Node temp = node;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public  void removeEvenNode() {
		if (node == null)  
	          return; 
		Node prev  = node;
	    Node fast = node.next;
	    
	    /* Change next link of previus node */
        prev.next = fast.next; 

        /* Free node */
        fast = null; 

        /*Update prev and now */
        prev = prev.next; 
        if (prev != null) { 
           fast = prev.next; 
           prev = null;
        }
	    }
	
	Node Delete(Node head, int position) {
	    // Complete this method
	    Node current = head;
	    Node parent = null;
	    int index = 0;
	    
	    while (current != null && index < position) {
	        parent = current;
	        current = current.next;
	        
	        index++;
	    }
	    
	    if (current != null && parent == null) {
	        // Delete head.
	        if (current.next != null) {
	            // Move head to next value.
	            head = current.next;
	        }
	        else {
	            // Just set the head to null.
	            head = null;
	        }
	    }
	    else if (current != null) {
	        // Delete current, link parent to child..
	        parent.next = current.next;
	    }
	    
	    return head;
	}
	
	public  void removeEvenPosNode(Node head) {
		Node curr = head;
		Node prev = null;
		int count = 0;
		while(curr.next != null) {
			if(curr != null && curr.next != null) {
				if(count%2 == 0) {
				prev = curr.next;
				curr.next = curr.next.next;
				curr = prev;
				}
			}
		}
	}
	    
	public static void main(String[] args) {
		DeleteEvenNodes n1 = new DeleteEvenNodes();
		n1.node = new Node(1);
        n1.node.next = new Node(4);
        n1.node.next.next = new Node(5);
        n1.node.next.next.next = new Node(9);
        n1.node.next.next.next.next = new Node(12);
        n1.node.next.next.next.next.next = new Node(13);
        n1.node.next.next.next.next.next.next = new Node(7);
        System.out.println("Before Removing the even nodes");
        n1.printList();
//        n1.removeEvenNode();
//        n1.Delete(node, 4);
        n1.removeEvenPosNode(node);
        System.out.println("after Removing the even position nodes");
        n1.printList();
        
	}
}
