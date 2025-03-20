package loops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		int num=n;
		int rem=0;
		double sum=0;
		while(num>0) {
			rem=num%10;
			double pow= Math.pow(rem,count);
			sum=sum+pow;
			num=num/10;
		}
			if (sum==n) {
				System.out.println("is armstrong number");
			}
			else {
				System.out.println("not an armstrong number");
			}
		}
}
		
