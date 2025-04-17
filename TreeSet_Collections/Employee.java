package TreeSet_Collections;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.salary=salary;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return this.name+" "+this.salary;
		
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	
}
