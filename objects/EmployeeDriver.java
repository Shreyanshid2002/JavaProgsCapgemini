package objects;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		System.out.println(e1.id);
		System.out.println("-----------------------------------------------------");
		Employee e2=new Employee(2, "Raj");
		System.out.println(e2.id+ " "+ e2.name);
		System.out.println("-----------------------------------------------------");
		Employee e3=new Employee(3, "Ram", "Wipro");
		System.out.println(e3.id+ " "+e2.name+ " "+e3.companyName);
		System.out.println("-----------------------------------------------------");
		Employee e4=new Employee(4, "Ritu", "TCS", 40000.00);
		System.out.println(e4.id+ " "+e4.name+ " "+e4.companyName+" "+e4.salary);
	}
}
