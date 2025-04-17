package hashSet_Collection;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "ID: "+this.id+" "+"Name: "+this.name;
	}
	@Override                               //Removes the duplicate as we override both hashcode and equals method
	public boolean equals(Object o) {
		Student s =(Student) o;
		return this.id==s.id && this.name.equals(s.name);
	}
	@Override
	public int hashCode() {
		return (int)(this.id+this.name.hashCode());
	}
}
