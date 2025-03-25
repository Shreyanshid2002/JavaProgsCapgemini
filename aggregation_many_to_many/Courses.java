package aggregation_many_to_many;

public class Courses {
	String name;
	Student[] students;
	
	Courses(String name, int size){
		this.name=name;
		this.students=new Student[size];
		
	}
}
