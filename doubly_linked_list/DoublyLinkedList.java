package doubly_linked_list;



public class DoublyLinkedList {
	Node head;
	Node tail;;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		if(tail.next==null) {
			tail.next=node;
			node.prev=tail;
			tail = node;
			count++;
			return;
		}
		
	}
	public void displayfromfirst() {
		if(head==null) {
			System.out.println("No data to display");
		}
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println();
	}
	public void displayfromlast() {
		if(tail==null) {
			System.out.println("No data to display");
		}
		Node temp =tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println();
	}
public void update(int pos, int data) {
		
		if(head==null ) {
			System.out.println("No data to update");
		}
		if(pos==1) {
			head.data=data;
			return;
		}
		if(pos==count) {
			tail.data=data;
			return;
		}

		Node current = head;
		int num=1;
		while(current!=null) {
			if(num==pos) {
				current.data=data;
				return;
			}
			num++;
			current=current.next;
		}
		
	}
	public void insertatpos(int pos, int data) {
		Node node = new Node(data);

		if (pos < 1 || pos > count + 1) {
			System.out.println("Out of bound");
			return;
		}

		if (head == null) {
			head = tail = node;
			count++;
			return;
		}

		if (pos == 1) {
			node.next = head;
			head.prev = node;
			head = node;
			count++;
			return;
		}

		if (pos == count + 1) { // insert at end
			tail.next = node;
			node.prev = tail;
			tail = node;
			count++;
			return;
		}

    // Insert in the middle
		Node current = head;
		int num = 1;
		while (current != null) {
			if (num == pos - 1) {
				node.next = current.next;
				current.next.prev = node;
				current.next = node;
				node.prev = current;
				count++;
				return;
			}
			num++;
			current = current.next;
		}
	}
}
