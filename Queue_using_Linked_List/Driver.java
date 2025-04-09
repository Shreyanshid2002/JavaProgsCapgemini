package Queue_using_Linked_List;

import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		while(flag) {
			System.out.println("Enter 1 to enqueue \nEnter 2 to dequeue \nEnter 3 to display \nEnter 4 to peek \nEnter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the value to insert");
					int value=sc.nextInt();
					queue.enqueue(value);
					break;
				case 2:
					queue.dequeue();
					break;
				case 3:
					queue.display();
					break;
				case 4:
					queue.peek();
					break;
				case 5:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
