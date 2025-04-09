package Stack_using_Array;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int size= sc.nextInt();
		Stack stack = new Stack(size);
		
		
		while (true) {
			System.out.println("Enter 1 to push \nEnter 2 to pop \nEnter 3 to peek \nEnter 4 to display \nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter the value to push");
					int value=sc.nextInt();
					stack.push(value);
					break;
				case 2:
					try {
						System.out.println(stack.pop()+" "+"is poped");
					}
					catch(Exception e){
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					try {
						System.out.println(stack.peek());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4: 
					try {
						stack.display();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5:
					flag = false;
					break;
				default :
					System.out.println("Invalid choice");
			}		
		
		}
	}
}
