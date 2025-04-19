package queue_Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
//		pq.add(10);
//		pq.add(20.0);
//		pq.add(null);
//		pq.add('c');
//		System.out.println(pq);  //It cannot store heterogeneous values only store homogeneous values also null values are not allowed
		pq.add(10);
		pq.add(8);
		pq.add(20);
		pq.add(11);
		pq.add(5);
		System.out.println(pq);// By default min heap ds so the smallest element is printed first and then the other elements are sorted in natural ordering
		System.out.println(pq.offer(10));
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove(11));
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.poll());
	}
}
