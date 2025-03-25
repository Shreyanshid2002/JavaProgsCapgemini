package encapsulation;

public class StudentMangementDriver {
	public static void main(String[] args) {
		StudentManagement s1 = new StudentManagement();

		s1.setName("Shreya", 1234);
		s1.getName(1234);

		s1.updatePassword(1234);

		System.out.println(s1.getPassword());
		s1.displayDetails();
		}
}
