package conditionalstatements;

import java.util.Scanner;

public class Calculator {
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	public static void add(double c, double d, double e) {
		System.out.println(c+d+e);
	}
	public static void sub(double n1, double n2) {
		System.out.println(n1-n2);
	}
	public static void mul(double num1, double num2) {
		System.out.println(num1*num2);
	}
	public static void mul(double num3, double  num4, double num5) {
		System.out.println(num3*num4*num5);
	}
	public static Scanner sc = new Scanner(System.in);
	public static void addMenu() {
		int choice;
		System.out.println("Enter 1 for adding two numbers\nEnter 2 for adding thre numbers");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter two numbers");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			add(a,b);
			break;
		case 2:
			System.out.println("Enter three numbers:");
			double c=sc.nextInt();
			double d=sc.nextInt();
			double e=sc.nextInt();
			add(c,d,e);
			break;	
		default:
			System.out.println("Invalid Choice");
		}
	}
	public static void subMenu() {
		System.out.println("Enter two numbers");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		sub(n1,n2);
	}
	public static void mulMenu() {
		int choice;
		System.out.println("Enter 1 for multiplying two numbers\nEnter 2 for multiplying three numbers");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter two numbers");
			double num1=sc.nextDouble();
			double num2=sc.nextDouble();
			mul(num1,num2);
			break;
		case 2:
			System.out.println("Enter three numbers:");
			double num3=sc.nextDouble();
			double num4=sc.nextDouble();
			double num5=sc.nextDouble();
			mul(num3, num4, num5);
			break;	
		default:
			System.out.println("Invalid Choice");
		}
	}
	public static void div() {
		System.out.println("Enter numerator: ");
		double num = sc.nextDouble();
		System.out.println("Enter denominator: ");
		double denom = sc.nextDouble();
		if(denom!=0) {
			System.out.println(num/denom);
		}
		else {
			System.out.println("denominator is zero, cannot divide");
		}
		
	}
} 
	

