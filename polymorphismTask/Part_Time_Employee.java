package polymorphismTask;

public class Part_Time_Employee extends Employee {
	private int workhrs;
	public Part_Time_Employee(String name, double salary, int workhrs) {
		super(name, salary);
		this.workhrs=workhrs;
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println("Working hour is: "+this.workhrs);
	}
	public void Designation() {
		System.out.println("Designation is associate");
	}
	public void jobRole() {
		System.out.println("Job role is Cloud Engineer");
	}

}
