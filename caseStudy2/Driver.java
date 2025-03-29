package caseStudy2;

public class Driver {
	public static void main(String[] args) {
		AbstractVehicle car = new Car("Swift", 120);
		AbstractVehicle bike = new Bike("Pulsar", 90);
		AbstractVehicle truck = new Truck("Tata Motor", 100);
		
		car.start();
		car.getCurrentSpeed();
		car.accelerate(10);
		car.brake(5);
		car.stop();
		car.displayDetails();
		
		
		bike.start();
		bike.getCurrentSpeed();
		bike.accelerate(6);
		bike.brake(10);
		bike.stop();
		bike.displayDetails();
		
		truck.start();
		truck.getCurrentSpeed();
		truck.accelerate(20);
		truck.brake(5);
		truck.stop();
		truck.displayDetails();
		
	}

}
