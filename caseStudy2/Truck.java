package caseStudy2;

public class Truck extends AbstractVehicle{
	public Truck(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
		
	}
	@override
	public void start() {
		System.out.println("Truck started");
	}
	@override
	public void stop() {
		System.out.println("Truck stopped");
	}
	@Override
	public void displayType() {
		// TODO Auto-generated method stub
		System.out.println("Truck details: ");
		
	}
	

}
