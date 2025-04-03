package stringclass;

public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student("Ram",1,"Male",89.00);
		System.out.println(s1.toString());
		Student s2 = new Student("Ram",1,"Male",90.00);
		System.out.println(s2.equals(s1));
		System.out.println(s1.hashCode());
	}

}
