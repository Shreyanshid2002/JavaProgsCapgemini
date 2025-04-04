package comparable_comparator_interface;

public class Employee implements Comparable {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "ID is= "+id+"Name is= "+name+"Salary is= "+salary;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.name.compareTo(e.name);
	}

//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee) o;
//		//COMPARING BASED ON SALARY
//		return (int)(this.salary-e.salary);
//	}
	
	
}
