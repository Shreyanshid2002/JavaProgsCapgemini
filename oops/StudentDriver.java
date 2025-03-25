package oops;


public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		System.out.println(s1.id);
		System.out.println("-----------------------------------------------------");
		Student s2=new Student(2, "Raj");
		System.out.println(s2.id+ " "+ s2.name);
		System.out.println("-----------------------------------------------------");
		Student s3=new Student(3, "Ram", "UEM");
		System.out.println(s3.id+ " "+s2.name+ " "+s3.clgName);
		System.out.println("-----------------------------------------------------");
		Student s4=new Student(4, "Ritu", "IEM", 90.8);
		System.out.println(s4.id+ " "+s4.name+ " "+s4.clgName+" "+s4.marks);
	}
}
