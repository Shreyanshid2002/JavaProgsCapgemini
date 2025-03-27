package polymorphismTask2;

public class Student extends Person {
	private int studentID;
	public Student(String name, int age, int studentID) {
		super(name,age);
		this.studentID=studentID;	
	}
	public void StudentGrade() {
		System.out.println("Student grade is 10");
	}
	public void displayStudentInfo() {
		super.displayInfo();
		System.out.println("Student Id is: "+this.studentID);

	}
}
