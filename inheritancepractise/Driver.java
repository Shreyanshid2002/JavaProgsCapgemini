package inheritancepractise;

public class Driver {
	public static void main(String[] args) {
		Car c = new Car("WB12345", "Hyndai","H350", 50000, true,4);
		Bike b = new Bike("WB21345","Shine","V2",1000,true,true);
		c.displayDetails();
		b.displayDetails();
	}

}
