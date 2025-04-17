package TreeSet_Collections;

import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet();
		ts.add(10);
		ts.add(2);
		ts.add(8);
		ts.add(30);
		ts.add(1);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(3));
		System.out.println(ts.headSet(9));
		System.out.println(ts.headSet(2,true));
		System.out.println(ts.headSet(3,true));
		System.out.println(ts.lower(10));
		System.out.println(ts.lower(1));
		SortedSet<Integer> ss =ts.tailSet(8);
		System.out.println(ss);
		NavigableSet<Integer> n = ts.tailSet(8,true);
		System.out.println(n);
		NavigableSet<Integer> m = ts.tailSet(8,false);
		System.out.println(m);
	}
}
