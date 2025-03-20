package array1D;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array: ");
		int[]arr= new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
	}
}

