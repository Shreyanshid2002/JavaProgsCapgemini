package lambdaExpressions;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return this.id+" "+this.name;
		
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
		
	}
}
