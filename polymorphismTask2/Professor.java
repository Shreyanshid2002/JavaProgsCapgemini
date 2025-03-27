package polymorphismTask2;

public class Professor extends Person{
	private String specialization;
	public Professor(String name, int age, String specialization) {
		super(name,age);
		this.specialization=specialization;
	}
	public void Designation() {
		System.out.println("Assistant professor");
	}
	public void displayProfessorInfo() {
		super.displayInfo();
		System.out.println("Professor specialization is: "+this.specialization);
	}

}
