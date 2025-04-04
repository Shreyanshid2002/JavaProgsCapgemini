package comparable_comparator_interface;

import java.util.Scanner;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Ram",20000.00);
		Employee e2 = new Employee(2,"Raj",30000.00);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to compare employee by name \nEnter 2 to compare employee by id \nEnter 3 to compare employee by salary");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				compareBasedOnName(e1,e2);
				break;
			case 2:
				compareBasedOnID(e1,e2);
				break;
			case 3:
				compareBasedOnSalary(e1,e2);
				break;
		}
			
	}	
		public static void compareBasedOnName(Employee e1,Employee e2) {
			if(e1.compareTo(e2)>0) {
				System.out.println("e1 is greater");
			}
			else if(e1.compareTo(e2)<0) {
				System.out.println("e2 is greater");
			}
			else {
				System.out.println("e1 and e2 both are equal");
			}
		
		}
		public static void compareBasedOnID(Employee e1,Employee e2) {
			CompareEmployeeByID compareID = new CompareEmployeeByID();
			
			if(compareID.compare(e1, e2)>0) {
				System.out.println("e1 is greater");
			}
			else if(compareID.compare(e1, e2)<0) {
				System.out.println("e2 is greater");
			}
			else {
				System.out.println("e1 and e2 both are same");
			}
		}
		public static void compareBasedOnSalary(Employee e1,Employee e2) {
			CompareEmployeeBySalary compareSalary = new CompareEmployeeBySalary();
			
			if(compareSalary.compare(e1, e2)>0) {
				System.out.println("e1 is greater");
			}
			else if(compareSalary.compare(e1, e2)<0) {
				System.out.println("e2 is greater");
			}
			else {
				System.out.println("e1 and e2 both are same");
			}
		}

}
