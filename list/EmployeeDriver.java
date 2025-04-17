package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeDriver {
	public static void main(String[] args) {
//		Employee e1 = new Employee(1,"Shreyanshi");
//		Employee e2 = new Employee(2,"Shreya");
//		Employee e3 = new Employee(3,"Shremoyee");
		
		
		ArrayList <Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(1,"Shreyanshi"));
		employees.add(new Employee(2,"Shreya"));
		employees.add(new Employee(3,"Shremoyee"));
		
		for(Employee e : employees) {
			System.out.println(e);
		}
//		Iterator<Employee>itr=employees.iterator();
//		while(itr.hasNext()) {
//			Employee x=itr.next();
//			if(x.name.equals("Shreya")) {
//				itr.remove();
//			}
//		}
		System.out.println(employees);
		System.out.println();
		Collections.sort(employees, new ComparebyName());
		System.out.println(employees);
		System.out.println("-----------------------------------------------------");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(6);
		al1.add(8);
		al1.add(100);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println("-------------------------------------------------------");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	
//		for(int i : al)
//		{
//			if(i==30) { 
//				Integer x = i; // Used for Boxing
//				al.remove(x);
//				break;
//			}
//		}
//		System.out.println(al);
		
		System.out.println(al);
		//Iterator
		Iterator<Integer> itr1 = al.iterator();
		while(itr1.hasNext()) {
			int x = itr1.next();
			if(x==30) {
				itr1.remove();
			}
		}
		System.out.println(al);
	}
}
