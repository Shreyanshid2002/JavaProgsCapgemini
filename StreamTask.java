package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTask {
	public static void main(String[] args) {
		//question  1
		List<Integer> num = Arrays.asList(10,20,30,50,60);
		double avg = num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average is: "+avg);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		//question 2
		List<String> strings = Arrays.asList("Hi","hello","hOLLA","bOnJoUr");
		List<String> upper = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> lower = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("Upper Case is: "+upper+"\nLower case is: "+lower);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		//question 3
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    	System.out.println("-------------------------------------------------------------------------------------------------------");
		
    	//question 4
    	List<Integer> al = Arrays.asList(2,3,1,2,5,8,7,4,9,2);
    	List<Integer> duplicates = al.stream().distinct().toList();
    	System.out.println("Elements after removing duplicates are: "+duplicates);
    	System.out.println("-------------------------------------------------------------------------------------------------------");
    	
    	//question 5
    	 List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Brandon", "Annie");
         char letter = 'A';
         long count = names.stream().filter(name -> name.startsWith(String.valueOf(letter))).count();
         System.out.println("Count of names starting with '" + letter + "': " + count);
         System.out.println("-------------------------------------------------------------------------------------------------------");
         
         //question 6
         List<String> items = Arrays.asList("banana", "apple", "cherry", "date");
         List<String> ascending = items.stream().sorted().collect(Collectors.toList());
         List<String> descending = items.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
         System.out.println("Ascending: " + ascending);
         System.out.println("Descending: " + descending);
         System.out.println("-------------------------------------------------------------------------------------------------------");
         
         //question 7
         List<Integer> al1 = Arrays.asList(2,3,1,2,5,8,7,4,9,2);
         //min
         Optional<Integer> optional = al1.stream().distinct().min((o1,o2)->o1-o2);
 		 if(optional.isPresent()) {
 			System.out.println("Min element is: "+optional.get());
 		 }
 		 //max
 		 Integer i =al1.stream().max((o1,o2)->o1-o2).get();
 		 System.out.println("Max element is: "+i);
 		 System.out.println("-------------------------------------------------------------------------------------------------------");
 		 
 		 //question 8
 		List<Integer> numb = Arrays.asList(10, 25, 3, 76, 44, 1, 99, 25);
        List<Integer> sorted = numb.stream().distinct().sorted().collect(Collectors.toList());
        if (sorted.size() >= 2) {
            int secondSmallest = sorted.get(1);
            int secondLargest = sorted.get(sorted.size() - 2);
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        }
        else {
            System.out.println("Not enough unique elements to determine second smallest and largest.");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
	}
}
