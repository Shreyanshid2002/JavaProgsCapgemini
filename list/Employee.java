package list;

public class Employee implements Comparable {
	int id;
    String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee) o;
		return this.id-e.id;
	}
}
