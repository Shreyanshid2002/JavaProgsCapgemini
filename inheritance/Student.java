package inheritance;


public class Student extends Person {
	private int studentID;
	
	public Student(String name, int age, int studentID) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.studentID=studentID;
		
	}
//	public void displayStudentDetails() {
//	USING SUPER KEYWORD
	public void displayDetails() {
		super.displayDetails();
		System.out.print(" "+this.studentID);
	}
}