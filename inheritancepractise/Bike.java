package inheritancepractise;

public class Bike extends Vehicle {
	private boolean hasGear;
	
	public Bike(String  vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
		
	}
	public void displayDetails() {
		super.rentVehicle();
		super.displayDetails();
		System.out.println(" "+this.hasGear);
	}

}
