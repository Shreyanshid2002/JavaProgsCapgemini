package aggregation_one_to_many_CRUD;

import java.util.Scanner;


public class UserDriver {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		User user=new User(size, "Shreyanshi");
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter 1 to add post\nEnter 2 to display\nEnter 3 to update\nEnter 4 to delete\nEnter 5 to exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter post name: ");
					String pName=sc.nextLine();
					System.out.println("Enter post id: ");
					int pID=sc.nextInt();
					Post p = new Post(pName,pID);
					user.addPost(p);
					break;
				case 2:
					user.displayPost();
					break;
				case 3:
					System.out.println("Enter old post ID: ");
					int oldID = sc.nextInt();
					System.out.println("Enter new post ID: ");
					int newID = sc.nextInt();
					user.updatePost(oldID,newID);
					System.out.println("post updated");
					break;
				case 4:
					System.out.println("Enter ID you want to remove: ");
					int post_ID=sc.nextInt();
					user.removePost(post_ID);
					break;
				case 5:
					flag = false;
					break;
			}
		}
	}
}
