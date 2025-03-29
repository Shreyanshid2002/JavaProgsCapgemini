package caseStudy2;

public class Bike extends AbstractVehicle{
		public Bike(String name, int speed) {
			super(name, speed);
			// TODO Auto-generated constructor stub	
		}
		@override
		public void start() {
			System.out.println("Bike started");
		}
		@override
		public void stop() {
			System.out.println("Bike stopped");
		}
		@Override
		public void displayType() {
			// TODO Auto-generated method stub
			System.out.println("Bike details: ");
			
		}
		
		

}
