package inheritance;

public class Driver {
	public static void main(String[] args) {
		Bike bike= new Bike("Kawasaki","V4");
		Car car = new Car("Ferrari","V8",1000);
		
		bike.Display();
		car.Display();
		System.out.println(car.price);

	}
}	
	
