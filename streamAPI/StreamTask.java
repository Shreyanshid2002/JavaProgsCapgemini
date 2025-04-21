package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTask {
	public static void main(String[] args) {
		//question  1
		List<Integer> num = Arrays.asList(10,20,30,50,60);
		double avg = num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average is: "+avg);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		//question 2
		List<String> strings = Arrays.asList("Hi","hello","hOLLA","bOnJoUr");
		
	}
}
