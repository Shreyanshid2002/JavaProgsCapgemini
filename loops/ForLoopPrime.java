package loops;

import java.util.Scanner;

public class ForLoopPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		isPrime(n);
	}
	public static void isPrime(int n) {
		int count=0;
	
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(n+ " is a Prime no");
		}
		else {
			System.out.println(n+ " is not a Prime no");
		}
	}
}
