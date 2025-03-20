package conditionalstatements;

import java.util.Scanner;

public class Else_If_Ladder {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		x=sc.nextInt();
//		if(x<0) {
//			if(x%2==0) {
//				System.out.println("Negative Even");
//			}
//			else {
//				System.out.println("Negative Odd");
//			}
//		}
//		else if(x>0){
//			if(x%2==0) {
//				System.out.println("Positive Even");
//			}
//			else {
//				System.out.println("Positive Odd");
//			}
//		}
		if(x>0 && x%2==0) {
			System.out.println("Positive Even");
		}
		else if (x>0 && x%2!=0) {
			System.out.println("Positive Odd");
		}
		else if(x<0 && x%2==0) {
			System.out.println("Negative Even");
		}
		else {
			System.out.println("Negative Odd");
		}
	}

}
