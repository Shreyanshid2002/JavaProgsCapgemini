package loops;

import java.util.Scanner;

public class ForLoopFactorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		factorial(n);
	}
	public static void factorial(int n) {
		int fact = 1;
		for(int i = 5; i>0; i-- ) {
			fact=fact*i;
		}
		System.out.println("The factorial of " +n+" is "  +fact);
	}
}
