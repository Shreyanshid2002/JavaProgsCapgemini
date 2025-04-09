package Stack_using_Linked_List;

public class Stack {
	Node top;
	int data;
	
	public void push(int value) {
		Node node = new Node(value);
		if(top==null) {
			top=node;
			return;
		}
		node.next=top;
		top=node;
		return;
	}
	public void pop() {
		Node current =top;
		if(top==null) {
			System.out.println("No data to pop out stack is empty");
			return;
		}
		System.out.println(top.data+" is popped");
		top=top.next;
		current.next=null;
		return;
	}
	public void peek() {
		if(top==null) {
			System.out.println("No data to display stack is empty");
			return;
		}
		System.out.println(top.data+" is the peek element");
		return;
	}
	public void display() {
		if(top==null) {
			System.out.println("No data to display stack is empty");
			return;
		}
		else {
			Node current = top;
			while(current!=null) {
				System.out.print(current.data+"-->");
				current = current.next;
			}
			System.out.println();
		}
	}
}
