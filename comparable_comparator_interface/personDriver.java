package comparable_comparator_interface;

public class personDriver {
	public static void main(String[] args) {
		
		Person p1 = new Person("Raj",24);
		Person p2 = new Person("Raj",24);
		
		
		int result = p1.compareTo(p2);
		if(result>0) {
			System.out.println("p1 is greater");
		}
		else if(result<0) {
			System.out.println("p2 is greater");
		}
		else {
			System.out.println("p1 and p2 both are same");
		}
	}
}
	
