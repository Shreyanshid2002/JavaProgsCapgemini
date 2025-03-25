package aggregation_many_to_many;

public class Student {
	String name;
	Courses[] arr;
	int count=0;
	
	Student(String name, int size){
		this.name=name;
		arr = new Courses[size];
		
	}
	public void addCourse(Courses  course) {
		if(count<arr.length) {
			arr[count++]=course;
		}
		else {
			System.out.println("Array is full");
		}
	}
}
