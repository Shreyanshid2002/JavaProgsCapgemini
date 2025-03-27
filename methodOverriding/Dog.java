package methodOverriding;

public class Dog extends Animal{
	String breed; //variable which belong to dog class only
	public Dog(String breed) {
		this.breed=breed;
		
	}
    public void sound() { // method overriding
		System.out.println("Dog is barking");
	}

}
