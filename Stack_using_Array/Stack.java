package Stack_using_Array;

public class Stack {
    int top;
    int capacity;
    int[] arr;

    // Constructor
    public Stack(int size) {
        this.arr = new int[size];
        top = -1; 
        capacity = size;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
            arr[++top] = value;  
    }
    public int pop() {
        if (top == -1) {
           throw new RuntimeException("Stack Underflow");
        } 
        return arr[top--];
    }
    public int peek() {
    	if(top==-1) {
    		throw new RuntimeException("Stack is empty");
    	}
    	return arr[top];
    }
    public boolean isEmpty() {
        return top == -1?true:false;
    }
    public boolean isFull() {
    	return top==capacity-1?true:false;
    }
    public void display() {
        if (top==-1) {
           throw new RuntimeException("Stack is empty");
        } 
            for (int i =top; i>=0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}



