package polymorphismTask2;

public class SchoolDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Shreyanshi", 22, 1);
		Person p1 = new Person("Rahul", 35);
		University u = new University();
		u.addPerson(s1);
		u.addPerson(p1);
		u.showPeople();
	}
}
