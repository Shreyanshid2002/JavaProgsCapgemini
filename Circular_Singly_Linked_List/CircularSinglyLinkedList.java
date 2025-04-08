package Circular_Singly_Linked_List;

import singlyLinkedList.Node;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    static int count;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            tail = node;
            node.next = head;
        }
        count++;
    }
    public void display() {
        if (head == null) {
            System.out.println("No data to display");
        } else {
            Node current = head;
            do {
                System.out.print(current.data + "-->");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public void insertatpos(int pos, int element) {
        if (pos < 1 || pos > count + 1) {
            System.out.println("Position out of bound");
            return;
        }
        Node node = new Node(element);
        if (pos == 1) { // Insert at beginning
            if (head == null) {
                head = node;
                tail = node;
                tail.next = head;
            } else {
                node.next = head;
                head = node;
                tail.next = head;
            }
        } else if (pos == count + 1) { // Insert at end
            tail.next = node;
            tail = node;
            tail.next = head;
        } else { // Insert in the middle
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        count++;
    }
    public void update(int posi, int uelement ) {
    	Node current = head;
		int num=1;
		if(head==null) {
			System.out.println("No data to update");
		}
		Node node = new Node(uelement);
	    if (posi == 1) { // Insert at beginning
	    	head.data=uelement;
	        return;
	    }
	    else if(posi==count) {
	    	tail.data=uelement;
	        return;
	    }
	    else if(posi>count || posi<1) {
	    	System.out.println("Invalid position");
	        return;
	    }
	    while(current.next!=null) {
	    	if(num==posi) {
	    		current.data=uelement;
	        	return;
	        }
	    }
	    num++;
	    current=current.next;
	}
    public void delete(int po) {
    	if(po<1 || po>count) {
    		System.out.println("Position out of bound");
    	}
    	if(head==null) {
    		System.out.println("No data to delete");
    	}
    
        // Case 1: Delete head node
        if (po == 1) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            // Only one node
            if (head == head.next) {
                head = null;
            } else {
                head = head.next;
                last.next = head;
            }
            count--;
            return;
        }

        // Case 2: Delete other than head
        Node temp = head;
        for (int i = 1; i < po - 1; i++) {
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next = null;
        count--;
    }

	 
 }

