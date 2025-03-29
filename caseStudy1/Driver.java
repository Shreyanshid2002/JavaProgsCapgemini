package caseStudy1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
//		PayPalPayment payment = new PayPalPayment(300.00f, "TXN123456");  // ❌ This will cause an error
//		payment.processPayment();
//		CreditCardPayment payment1 = new CreditCardPayment(600.00f,"TXN123546");
//		payment1.processPayment();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to opt for Credit Card Payment \nEnter 2 to opt for Pay Pal Payment \nEnter 3 to exit");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Original amount: ");
			float am = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter transaction id: ");
			String tid = sc.nextLine();
			CreditCardPayment p = new CreditCardPayment(am,tid);
			p.processPayment();
			break;
		case 2:
			System.out.println("Enter original amount: ");
			float am2 = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter transaction ID: ");
			String tid2 = sc.nextLine();
			PayPalPayment pp = new PayPalPayment(am2,tid2);
			pp.processPayment();
			break;
		default :
			System.out.println("Invalid choice");
			break;
			
		}
			
		
	}
}
