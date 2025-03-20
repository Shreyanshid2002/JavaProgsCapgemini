package array2D;

import java.util.Scanner;

public class MaxElement {
	public static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements: ");
		for(int i= 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void max(int[][] arr) {
		int max = arr[0][0];
		for(int i= 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int[][] arr = input();
		max(arr);
					
	}

}


