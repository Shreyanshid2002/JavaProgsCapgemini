package doubly_linked_list;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert \nEnter 2 to display from first \nEnter 3 to display from last \nEnter 4 to update \nEnter 5 to insert at a position \nEnter 6 to exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				list.displayfromfirst();
				break;
			case 3:
				list.displayfromlast();
				break;
			case 4:
				System.out.println("Enter the position");
				int pos=sc.nextInt();
				System.out.println("Enter the data");
				int data1=sc.nextInt();
				list.update(pos, data1);
				break;
			case 5:
				System.out.println("Enter the position");
				int po=sc.nextInt();
				System.out.println("Enter the data");
				int data2=sc.nextInt();
				list.insertatpos(po, data2);
				break;
			case 6:
				flag=false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}