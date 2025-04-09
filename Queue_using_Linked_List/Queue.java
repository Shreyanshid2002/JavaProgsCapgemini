package Queue_using_Linked_List;

import singlyLinkedList.Node;

public class Queue {
	Node front;
	Node rear;
	
	public void enqueue(int data) {
		Node node = new Node(data);
		if(front==null && rear==null) {
			front=node;
			rear=node;
			return;
		}
		rear.next=node;
		rear=node;
		return;
	}
	public void dequeue() {
		if(front==null && rear==null) {
			System.out.println("No data present to dequeue");
			return;
		}
		Node temp = front;
		System.out.println(temp.data+" is dequed");
		front=front.next;
		 if (front == null) {
		        rear = null; // Reset rear when queue becomes empty
		    }
		    
		    temp.next = null;
	}
	public void display() {
		if(front==null && rear==null) {
			System.out.println("Queue is empty");
			return;
		}
		Node current = front;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println();
	}
	public void peek() {
		if(front==null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(front.data+" is the peek element");
	}
	
}
