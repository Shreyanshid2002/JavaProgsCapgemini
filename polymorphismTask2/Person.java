package polymorphismTask2;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Name is: "+this.name+" Age is: "+this.age);
	}
}
