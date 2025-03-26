package inheritancepractise;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public  Vehicle(String  vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		super();
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	public void displayDetails() {
		System.out.print(this.vehicleNumber+" "+this.brand+" "+this.model+" "+this.rentalPricePerDay+" "+this.isAvailable);
		
	}
	public void rentVehicle() {
		if(isAvailable) {
			System.out.println("Vehicle is available for rent");	
		}
		else{
			System.out.println("Vehicle is not available for rent");
		}
	}

}
