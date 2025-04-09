package Stack_using_Linked_List;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean flag =true;
		Stack stack = new Stack();
		Scanner sc = new Scanner (System.in);
		while(flag) {
			System.out.println("Enter 1 to push \nEnter 2 to pop \nEnter 3 to display \nEnter 4 to peek \nEnter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the value to push");
					int value=sc.nextInt();
					stack.push(value);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					stack.display();
					break;
				case 4:
					stack.peek();
					break;
				case 5:
					flag = false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
