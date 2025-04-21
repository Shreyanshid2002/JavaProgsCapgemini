package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2,3,1,2,5,8,7,4,9,2);
		System.out.println(al);
//		Stream s1 = al.stream();
//		Stream s2 = s1.distinct();
//		s2.forEach(n->System.out.println(n));
//		al.stream().distinct().forEach(n->System.out.println(n));		
//		System.out.println(al);
		
		
		//min 
		Optional<Integer> optional = al.stream().distinct().min((o1,o2)->o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//max
		Integer i =al.stream().max((o1,o2)->o1-o2).get();
		System.out.println(i);
		
		//Sorting in ascending order
		al.stream().sorted().forEach(n->System.out.print(n+" "));
		
		//Sorting in descending order
		al.stream().sorted((o1,o2)->o2-o1).forEach(n->System.out.println(n+" "));
		 
		//Map function
		al.stream().distinct().sorted().map(n->n*n).forEach(n->System.out.print(n+" "));
		
		//Filter Predicate
		al.stream().distinct().filter(n->n%2==0).forEach(n->System.out.println(n+" "));
		
		//toList function
		List<Integer> li = al.stream().distinct().filter(n->n%2==0).toList();
		
		Stream s1 = Stream.of(1,4,7,"Hello",10.5);
		s1.forEach(n->System.out.print(n+" "));
		
		//findFirst
		Optional<Integer> op = al.stream().findFirst();
		System.out.println(op.get());
		
		//findAny
		System.out.println(al.stream().findAny().get());
		
		//count()
		System.out.println(al.stream().count());
		
		List<String> strings = Arrays.asList("hello","demo","hi");
		List<Integer> num = Arrays.asList(1,2,3);
		Stream s2 = strings.stream();
		Stream s3 = num.stream();
		Stream.concat(s2, s3).forEach(n->System.out.println(n+" "));
		
		//allMatch
		System.out.println(al.stream().distinct().allMatch(n->n%2==0));
		
		//anyMatch()
		System.out.println(al.stream().anyMatch(n->n%2==0));
	}
}
