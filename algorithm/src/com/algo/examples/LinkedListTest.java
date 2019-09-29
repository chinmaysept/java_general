package com.algo.examples;

public class LinkedListTest {
	private static Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public Node nthFromLastNode(Node head, int n) {
		Node firstPtr = head;
		Node secondPtr = head;
		for (int i = 0; i < n; i++) {
			firstPtr = firstPtr.next;
		}
		while (firstPtr != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		return secondPtr;
	}

	// This function will find middle element in linkedlist
	public Node findMiddleNode(Node head) {
		Node slowPointer, fastPointer;
		slowPointer = fastPointer = head;
		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}
		return slowPointer;
	}
	
	/*void deleteEven() {
        boolean con = false;
        Node add;
        Node move;
        move = head;
        if (move.value % 2 == 0) {
            head = move.next;
            con = true;
        }
        add = move;
        move = move.next;
        while (move.next != null) {
            if (move.next.value % 2 == 0) {
                move.next = move.next.next;
                System.out.println("Deleted nodes..."+move.value);
                con = true;
            } else {
                move = move.next;
            }
        }
        
        
        
        if (!con)
            System.out.println("No even numbers in list");
    }*/
	
	public void removeEvens() {
        if (head == null) return;

        // removing all even nodes after the root
        Node prev = head;
        while (prev.next != null) {
            if (isEven(prev.next))
                prev.next = prev.next.next;   // next is even: delete it
            else
                prev = prev.next;             // next is not even: proceed
        }

        // delete root if it's even
        if (isEven(head))
            head = head.next;
        
    }

    private boolean isEven(Node node) {
        return node.value % 2 == 0;
    }
    
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
    int detectLoop()
    {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
    }
    
    void remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.value == ptr2.next.value) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
    
    void pairWiseSwap()
    {
        Node temp = head;
 
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
 
            /* Swap the data */
            int k = temp.value;
            temp.value = temp.next.value;
            temp.next.value = k;
            temp = temp.next.next;
         }
    }
    
    void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
 
        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
    }
    
    boolean areIdentical(LinkedListTest listb)
    {
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.value != b.value)
                return false;
 
            /* If we reach here, then a and b are not null
               and their data is same, so move to next nodes
               in both lists */
            a = a.next;
            b = b.next;
        }
 
        // If linked lists are identical, then 'a' and 'b' must
        // be null at this point.
        return (a == null && b == null);
    }
       

	public static void main(String[] args) {
		LinkedListTest list = new LinkedListTest(); // Creating a linked list
//		Node head = new Node(5);
		//head.setValue(6);
//		list.addToTheLast(new Node(1));
//		list.addToTheLast(new Node(2));
//		list.addToTheLast(new Node(3));
//		list.addToTheLast(new Node(4));
//		list.addToTheLast(new Node(5));
//		list.addToTheLast(new Node(6));
//		list.addToTheLast(new Node(7));
//		list.addToTheLast(new Node(8));
//		list.addToTheLast(head);
//		list.addToTheLast(new Node(6));
//		list.addToTheLast(new Node(7));
//		list.addToTheLast(new Node(1));
//		list.addToTheLast(new Node(2));
//		list.addToTheLast(new Node(3));
//		list.addToTheLast(new Node(4));
//		list.printList();
		
		// Finding 2nd node from end
//		Node nthNodeFromLast = list.nthFromLastNode(head, 2);
//		System.out.println("2nd node from end is : " + nthNodeFromLast.value);
		// finding middle element 
		//Node middle= list.findMiddleNode(head); 
//		System.out.println("Middle node will be: "+ list.findMiddleNode(head).value);
		//Delete even number nodes
//		list.removeEvens();
		list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
		head = list.reverse(head);
		list.printList();

	}
}

