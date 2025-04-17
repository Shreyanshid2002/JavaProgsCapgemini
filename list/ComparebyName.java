package list;

import java.util.Comparator;

public class ComparebyName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
	
}