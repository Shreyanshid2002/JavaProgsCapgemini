package coVariantReturnType;

public class Bike extends Vehicle {
	public Bike getOject() { //changing vehicle return type to bike return type is called covariant return type
		return new Bike();
	}

}
