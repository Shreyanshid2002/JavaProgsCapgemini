package array1D;

import java.util.Scanner;

public class PalindromicArray {
	public static int[] input(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements of the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void ispal(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			int num=arr[j];
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum*10+rem;
				num=num/10;
				}
			if(sum==arr[j]) {
				System.out.println(arr[j] + " is Palindrome");
			}
			else {
				System.out.println(arr[j] + " is not Palindrome");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = input();
		ispal(arr);
	}
		
		
		
}
