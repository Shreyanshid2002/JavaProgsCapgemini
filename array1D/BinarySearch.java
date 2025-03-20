package array1D;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,4,45,67,78};
		int target = 45;
//		System.out.println(Arrays.binarySearch(arr, target));
		
		int[] array = Arrays.copyOf(arr, 7);
//		for(int i : array) {
		for(int i : Arrays.copyOfRange(arr, 0, 3)){
			System.out.println(i);
		
		}
		System.out.println(Arrays.equals(arr, array));
		
	}
}
