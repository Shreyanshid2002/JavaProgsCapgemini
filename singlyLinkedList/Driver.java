package singlyLinkedList;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert data \nEnter 2 to display data \nEnter 3 to update \nEnter 4 to insert at a position \nEnter 5 to delete at a position \nEnter 6 to exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("Enter the position you want to update: ");
				int pos = sc.nextInt();
				System.out.println("Enter the data: ");
				int data1 = sc.nextInt();
				list.update(pos,data1);
				break;
			case 4:
				System.out.println("Enter the position: ");
				int posi = sc.nextInt();
				System.out.println("Enter the data: ");
				int element = sc.nextInt();
				list.insertAtPos(posi,element);
				break;
			case 5:
				System.out.println("Enter the position: ");
				int po = sc.nextInt();
				list.deleteAtPos(po);
				break;
			case 6 :	
				flag=false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}