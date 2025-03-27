package polymorphismTask;

public class Full_Time_Employee extends Employee{
	private int bonus;
	public Full_Time_Employee(String name, double salary, int bonus) {
		super(name,salary);
		this.bonus=bonus;
	}
	public void jobRole() {
		System.out.println("Job role is Developer");
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println("Bonus is: "+this.bonus);
	}
}
