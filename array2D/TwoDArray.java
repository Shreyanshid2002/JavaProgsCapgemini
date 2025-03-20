package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elemts: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing the array: ");
//		FOR PRINTING ARRAY OF ARRAYS
//		System.out.println(Arrays.deepToString(arr));
		
		
//      FOR EACH LOOP
		for(int[] i:arr) {
			for(int j:i) {
				System.out.println(j);
			}
		}
	}
}
