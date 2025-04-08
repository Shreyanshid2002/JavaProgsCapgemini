package Circular_Singly_Linked_List;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert \nEnter 2 to display \nEnter 3 to insert at pos \nEnter 4 to update \nEnter 5 to delete \nEnter 6 to exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("Enter the position: ");
				int pos=sc.nextInt();
				System.out.println("Enter the data: ");
				int element =sc.nextInt();
				list.insertatpos(pos,element);
				break;
			case 4 :
				System.out.println("Enter the position");
				int posi=sc.nextInt();
				System.out.println("Enter the data: ");
				int uelement =sc.nextInt();
				list.update(posi,uelement);
				break;
			case 5:
				System.out.println("Enter the position");
				int po=sc.nextInt();
				list.delete(po);
				break;
			case 6 :
				flag=false;
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}
}