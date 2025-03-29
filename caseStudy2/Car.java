package caseStudy2;

public class Car extends AbstractVehicle{

	public Car(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
		
	}
	@override
	public void start() {
		System.out.println("Car started");
	}
	@override
	public void stop() {
		System.out.println("Car stopped");
	}
	@Override
	public void displayType() {
		// TODO Auto-generated method stub
		System.out.println("Car details: ");
		
	}
	

}
