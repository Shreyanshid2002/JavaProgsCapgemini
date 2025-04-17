package LinkedList_Collection;

import java.util.Comparator;


public class CompareByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}

}
