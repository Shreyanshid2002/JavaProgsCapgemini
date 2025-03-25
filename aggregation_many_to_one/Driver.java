package aggregation_many_to_one;

public class Driver {
	public static void main(String[] args) {
		Bank b = new Bank("SBI");
		Customer c1 = new Customer(1, "Ram", b);
		Customer c2 = new Customer(2, "Raj", b);
		Customer c3 = new Customer(3, "Rahul", b);
		
		c1.Display();
		c2.Display();
		c3.Display();
	}
}
