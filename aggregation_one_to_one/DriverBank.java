package aggregation_one_to_one;

public class DriverBank {
	public static void main(String[] args) {
		Customer c = new Customer("Shreyanshi");
		Bank b = new Bank("SBI", c);
		
		b.display();
		b=null;
		System.out.println(c.cName);
	}
}
