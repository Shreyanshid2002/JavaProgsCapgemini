package hashSet_Collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hi");
		hs.add(10);
		hs.add(null);
		hs.add('c');
		hs.add(20);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		System.out.println(hs.clone());
		System.out.println(hs.contains(30));
		System.out.println(hs.contains(10));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.remove(20));
		System.out.println(hs);
		System.out.println("----------------------------------");
		HashSet<Student> hs1 = new HashSet<Student>();
		hs1.add(new Student(1,"Shreyanshi"));
		hs1.add(new Student(2,"Trisha"));
		hs1.add(new Student(1,"Shreyanshi"));
		hs1.add(new Student(3,"Madhu"));
		
		System.out.println(hs1);
		
		
	}
}
