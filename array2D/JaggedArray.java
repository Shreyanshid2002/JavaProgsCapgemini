package two2array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	
	public static int[][] jaggedarray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n= sc.nextInt();
		int[][] arr= new int[n][];
		for(int i=0; i<n ; i++) {
			System.out.println("Enter the no of cols: "+i);
			int cols = sc.nextInt();
			arr[i]=new int[cols];
				for(int j=0;j<cols;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
		
		return arr;
	}
	public static void print(int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	public static void main(String[] args) {
		int[][] arr = jaggedarray();
		print(arr);
	}
}
