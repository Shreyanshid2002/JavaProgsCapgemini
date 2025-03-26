package inheritance;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.age=age;
	}


//	public void  displayPersonalDetails() {
//	USING SUPER KEYWORD
	public void displayDetails() {
		System.out.print(this.name+ " "+this.age);
	}
}
