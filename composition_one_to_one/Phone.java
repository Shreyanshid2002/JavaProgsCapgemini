package composition_one_to_one;

public class Phone {
	String phone_Name;
	Battery b;
	
	public Phone(String phone_Name, String b_type) {
		this.phone_Name=phone_Name;
		this.b = new Battery(b_type);
	}
	public void Display() {
		System.out.println(phone_Name+ " "+b.b_type);
	}
}
