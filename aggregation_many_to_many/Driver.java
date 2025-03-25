package aggregation_many_to_many;
import java.util.Arrays;
public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student("Shreyanshi",3);
		Student s2 = new Student("Shreya",2);
		
		Courses c1 = new Courses("Java",3);
		Courses c2 = new Courses("Python",4);
		Courses c3 = new Courses("AIML",2);
		
		s1.addCourse(c1);
		s2.addCourse(c3);
		s1.addCourse(c2);
		s2.addCourse(c1);
		System.out.println(Arrays.toString(s1.arr)+ " "+Arrays.toString(s2.arr));
	}
	
	
	
}
