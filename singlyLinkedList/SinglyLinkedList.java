package singlyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	Scanner sc = new Scanner(System.in);
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
		}
		else{
			tail.next = node;
			tail=node;
			count++;
		}
	}
	public void insertAtPos(int pos, int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail =node;
			count++;
			return;
		}
		node.data = data;
		node.next = null;
		if(pos<1 || pos>count+1) {
			System.out.println("Out of bound");
		}
		else if(pos==1) {
			node.next = head;
			head=node;
			count++;
		}
		else {
			Node current = head;
			while(--pos>1) {
				current = current.next;
			}
			node.next=current.next;
			current.next=node;
			count++;
		}
		System.out.println();
		
	}
	
	public void update(int pos, int data) {
		
		Node current = head;
		int num=1;
		if(head==null) {
			System.out.println("No data to update");
		}
		else {
			while(current!=null) {
				if(num==pos) {
					current.data = data;
				}
				current=current.next;
				num++;
			}
			if(num>=pos) {
				System.out.println("Cannot update because it is out of bound");
			}
		}
		System.out.println();
	}
	public void display() {
		if(head==null) {
			System.err.println("No data to display");
		}
		else {
			Node current = head;
			while(current!=null) {
				System.err.print(current.data+"-->");
				current = current.next;
			}
			System.out.println();
		}
	}
	public void deleteAtPos(int pos) {
		if(head == null) {
			System.out.println("No data to delete");
		}
		else {
			Node current = head;
			Node prev = null;
			if(pos<1 || pos>count) {
				System.out.println("Out of bound");
				return;
			}
			else if(pos==1) {
				head=head.next;
				count--;
				return;
			}
			while(--pos>0) {
				prev = current;
				current = current.next;
			}
			prev.next=current.next;
			count--;
		}
		
	}
	
}
