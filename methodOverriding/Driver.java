package methodOverriding;

public class Driver {
	public static void main(String[] args) {
		Animal dogAnimal=new Dog("Siberian husky");//upcasting
//		System.out.println(dogAnimal.breed); // cannot access members of child class with parent reference
		String dogBreed=((Dog)dogAnimal).breed; //downcasting
		System.out.println(dogBreed);
		dogAnimal.sound();
		
	}
	
}
