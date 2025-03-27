package polymorphismTask;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e = new Full_Time_Employee("Shreyanshi", 40000, 10000);
		
		Full_Time_Employee e1 = (Full_Time_Employee) e;
		e.employeeInfo();
		((Full_Time_Employee)e).jobRole();
		Employee ee = new Part_Time_Employee("Shreyanshi", 40000, 8);
		Part_Time_Employee e2 = (Part_Time_Employee) ee;
		ee.employeeInfo();
		((Part_Time_Employee)ee).Designation();
		Details(e);
		System.out.println("----------------------------------");
		Details(ee);
	
	}
	static void Details(Employee eee) {
		if(eee instanceof Full_Time_Employee) {
			eee.jobRole();
		}
		else {
			eee.jobRole();
			((Part_Time_Employee)eee).Designation();
		}
		
	}
}
