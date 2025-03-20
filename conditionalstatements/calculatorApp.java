package conditionalstatements;

import java.util.Scanner;

public class calculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to calculate? Yes or No");
		String ans = sc.next();
		int ans1;
		do {
			System.out.println("Welcome to Calculator app");
			System.out.println("Enter 1 to add\nEnter 2 to subtract\nEnter 3 to multiply\nEnter 4 to divide");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					Calculator.addMenu();
					break;
				case 2:
					Calculator.subMenu();
					break;
				case 3:
					Calculator.mulMenu();
					break;
				case 4:
					Calculator.div();
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("Thank you for using calculator app");
			System.out.println("Do you want to calculate again? Yes for 1 or No for 0");
			ans1 = sc.nextInt();
		}while(ans1 != 0);
				System.out.println("Thank you for using calculator app");
	}
}