package LinkedList_Collection;

 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(null);
		list.add('c');
//		Collections.sort(list);
		System.out.println(list);
		
		
		LinkedList <Employee> employees= new LinkedList<Employee>();
		employees.add(new Employee(1,"Shreyanshi"));
		employees.add(new Employee(2,"Shreya"));
		employees.add(new Employee(3,"Shremoyee"));
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		Iterator<Employee>itr=employees.iterator();
		while(itr.hasNext()) {
			Employee x=itr.next();
			if(x.name.equals("Shreya")) {
				itr.remove();
			}
		}
		System.out.println(employees);
		System.out.println();
		Collections.sort(employees, new CompareByName());
		System.out.println(employees);
		System.out.println("-----------------------------------------------------");
		LinkedList<Integer> al1 = new LinkedList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(6);
		al1.add(8);
		al1.add(100);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println("-------------------------------------------------------");
		LinkedList<Integer> al = new LinkedList<Integer>();
		Iterator<Integer> itr2=al1.descendingIterator();
		while(itr2.hasNext()) {
			Integer x=itr2.next();
		}
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.push(500);
		al.addFirst(100);
		System.out.println(al);
		al.addLast(200);
		System.out.println(al);
	
		System.out.println(al.peek());
		System.out.println(al.peekFirst());
		System.out.println(al.peekLast());
		System.out.println("--------------------");
		System.out.println(al.poll());
		System.out.println(al.pollLast());
		System.out.println("--------------------");
		System.out.println(al.remove());
		System.out.println(list.offer(null));
		System.out.println(list.offerFirst('c'));
		System.out.println(list);
		System.out.println(list.offerLast("Hello"));
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
