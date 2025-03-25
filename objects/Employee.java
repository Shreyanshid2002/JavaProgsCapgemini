package objects;

public class Employee {
	int id;
	String name;
	String companyName;
	double salary;
	
	public  Employee() {
		System.out.println("No arg constructor");
	}
	public Employee(int id) {
		this.id=id;
		System.out.println("One arg constructor");
	}
	public Employee(int id, String name) {
		this.id=id;
		this.name= name;
		System.out.println("Two arg constructor");
	}
	public Employee(int id, String name, String companyName) {
		this.id=id;
		this.name= name;
		this.companyName=companyName;
		System.out.println("Three arg constructor");
	}
	public Employee(int id, String name, String companyName, double salary) {
		this.id=id;
		this.name= name;
		this.companyName=companyName;
		this.salary=salary;
		System.out.println("Three arg constructor");
	}
	
	
}
