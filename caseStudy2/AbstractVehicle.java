package caseStudy2;

public abstract class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed;
	
	public AbstractVehicle(String name, int speed) {
		this.name=name;
		this.speed=speed;
	}
	public void displayDetails() {
		System.out.println("Name of vehicle: "+this.name+" Speed of vehicle: "+this.speed);
		System.out.println();
	}
	public void accelerate(int increment) {
		speed+=increment;
		System.out.println("Vehicle accelereated ... Speed is now: "+speed);
	
		
	}
	public void brake(int decrement) {
		speed-=decrement;
		System.out.println("Vehicle decelerated... Speed io now: "+speed);
		
		
	}
	public void getCurrentSpeed() {
		System.out.println(this.speed);
		
	}
	

}
