package polymorphismTask;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
		
	}
	public void employeeInfo() {
		System.out.println("Name is: "+this.name+" Salary is: "+this.salary);
	}
	public void jobRole() {
		
	}
}
