package aggregation_one_to_one;

public class Driver {
	public static void main(String[] args) {
		Sim sim = new Sim(1234567895);
		Phone phone = new Phone("Samsung", sim);
		phone.display();
		phone=null;
		System.out.println(sim.phoneNo);
	}
}
