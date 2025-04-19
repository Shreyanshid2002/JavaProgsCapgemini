package queue_Collections;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(10.2);
//		ad.add(null); //Null pointer exception
		ad.add('c');
		ad.add(10);
		
		System.out.println(ad);
		
		ad.addFirst(50);
		ad.addLast(100);
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad.removeFirst());
		ad.add(40);
		ad.add("hi");
		ad.add(true);
		ad.add(6);
		ad.add(6);
		System.out.println(ad);
		System.out.println(ad.removeLastOccurrence(6));
		System.out.println(ad);
	}
}
