package stringclass;

public class Student {
	 String name;
	 int id;
	 String gender;
	 double marks;
	 
	 public Student(String name, int id, String gender, double marks) {
		 this.name=name;
		 this.id=id;
		 this.gender=gender;
		 this.marks=marks;
	 }
	 @Override
	 public String toString() {
		return "Student[name="+name+" "+"id="+id+" "+"gender="+gender+" "+"marks="+marks+"]";
		 
	 }
	 @Override
	 public int hashCode() {
		return (int)(this.name.hashCode()+this.id+this.gender.hashCode()+this.marks);
		 
	 }
	 @Override
	 public boolean equals(Object obj) {
		 if (obj instanceof Student) {
			 Student s = (Student) obj;
			 return this.name.equals(s.name) && this.id==s.id && this.gender.equals(s.gender) && this.marks==s.marks;
		 }
		return false;
		 
	 }

}
