package aggregation_one_to_one;

public class Phone {
	String name;
	Sim sim;
	public Phone(String name, Sim sim) {
		this.name=name;
		this.sim = sim;
		
	}
	public void display() {
		System.out.println(this.name+" "+this.sim.phoneNo);
	}
}
