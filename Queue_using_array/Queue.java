package Queue_using_array;

public class Queue {
	int front;
	int rear;
	int size;
	int [] arr;
	
	public Queue(int size) {
		this.size=size;
		this.arr = new int[size];
		front=-1;
		rear=-1;
	}
	public void enqueue(int data){
	    if (isFull()) {
	        System.out.println("Queue is full");
	        return;
	    }

	    if (front == -1) {
	        front = 0;
	    }

	    rear++;
	    arr[rear] = data;
	    System.out.println(data + " enqueued to queue");
	}

	public int dequeue() {
		    if (isEmpty() || front > rear) {
		        System.out.println("Queue is empty");
		        return -1;
		    }

		    int removed = arr[front];
		    System.out.println(removed + " Deleted");
		    
		    if (front == rear) {
		        // Reset the queue
		        front = rear = -1;
		    } else {
		        front++;
		    }

		    return removed;
		}

	
	public void display() {
		if(this.front==-1 && this.rear==-1) {
			System.out.println("No data to display");
			return;
		}
		int count=this.front;
		while(count!=rear+1) {
			System.out.println(this.arr[count]+" ");
			count++;
		}
	}
	public void peek() {
	    if (isEmpty() || front > rear) {
	        System.out.println("Queue is empty");
	        return;
	    }
	    System.out.println(arr[front] + " is at the front (peek)");
	    return;
	}

	public boolean isFull() {
		if((this.rear+1)==this.arr.length) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(this.front==-1 && this.rear==-1) {
			return true;
		}
		return false;
	}
			
		
}
