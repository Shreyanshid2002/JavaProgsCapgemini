package inheritance;

public class Car1 extends Vehicle1{
	int hp;
	public Car1 (String n, String engType,int hp) {
		super(n, engType);
		this.hp=hp;
		System.out.println("Child");
	}
}
