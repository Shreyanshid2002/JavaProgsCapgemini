
package methods;
import java.util.*;
public class AccessMethods {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int key =sc.nextInt();
		search(arr,key);
	}
		
		public static void search(int arr[], int key) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==key) {
					System.out.println("Found key");
					count = 1;
				}
			}
				if(count==0)
					System.out.println("Not Found");
				}
			}
		
		
		
	
