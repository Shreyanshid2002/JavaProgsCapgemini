package lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(9,"Trisha");
		Employee e2 = new Employee(1,"Shrey");
		Employee e3 = new Employee(3,"Madhu");
		List<Employee> list = Arrays.asList(e1,e2,e3);
		
		//Lambda expression
		Comparator<Employee> c =(o1,o2)->o1.id-o2.id;
		Collections.sort(list,c);
		System.out.println(list);
	}
}
