package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class SymmetricArray {
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
	public static void sym(int[][] arr) {
		boolean flag= true;
		for(int i= 0; i < arr.length; i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				if(arr[i][j]!=arr[j][i]) {
					flag =false;
					break;
				}
			}	
			if(!flag) {
				break;
			}
		}
		if(flag) {
			System.out.println("Symmetric");
		}
		else {
			System.out.println("Not symmetric");
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = input();
		sym(arr);
					
	}

}
