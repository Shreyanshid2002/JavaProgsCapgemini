package polymorphismTask2;


public class University {
	private Person[] people=new Person[5];
	static int count=0; 

	public void addPerson(Person p) {
		if(count<people.length) {
			people[count++]=p;
		}
		else {
			System.out.println("Array is full");
		}
			
	}
	public void showPeople() {
		for(int i=0;i<count;i++) {
			if(people[i] instanceof Student) {
				 (Student(people[i])).displayStudentInfo();
			}
			else {
				(Professor(people[i])).displayProfessorInfo();
			
			}
		}
	}
	
}