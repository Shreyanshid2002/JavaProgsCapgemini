package TreeSet_Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
//		tree.add(null);        //Null pointer exception
//		tree.add(20);
//		tree.add(20.3);       //Class cast exception
//		tree.add(null);
//		tree.add("hi");
//		
//		System.out.println(tree);
		
		tree.add(20);
		tree.add(30);
		tree.add(10);
		tree.add(5);
		tree.add(20);                //Does not contain duplicates
		
		System.out.println(tree);    //Sorts in ascending order by default
		
		TreeSet<Employee> e = new TreeSet<Employee>();
		e.add(new Employee("Shreyanshi",40000));
		e.add(new Employee("Trisha",42000));
		e.add(new Employee("Madhu",38000));
		
		System.out.println(e); // classcastException so we need to override the compareTo() of Comaparable Interface
		
		TreeSet<Employee> emp = new TreeSet<Employee>(new CompareByName());
		emp.add(new Employee("Shreyanshi",40000));
		emp.add(new Employee("Trisha",42000));
		emp.add(new Employee("Madhu",38000));
		System.out.println(emp);
		
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}   