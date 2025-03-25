package oops;


public class Student {
	int id;
	String name;
	String clgName;
	double marks;
	
	public  Student() {
		System.out.println("No arg constructor");
	}
	public Student(int id) {
		this.id=id;
		System.out.println("One arg constructor");
	}
	public Student(int id, String name) {
		this.id=id;
		this.name= name;
		System.out.println("Two arg constructor");
	}
	public Student(int id, String name, String clgName) {
		this.id=id;
		this.name= name;
		this.clgName=clgName;
		System.out.println("Three arg constructor");
	}
	public Student(int id, String name, String clgName, double marks) {
		this.id=id;
		this.name= name;
		this.clgName=clgName;
		this.marks=marks;
		System.out.println("Four arg constructor");
	}
	
	
}

