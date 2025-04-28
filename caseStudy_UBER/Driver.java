package caseStudy_UBER;

public class Driver extends User{
	
	private boolean available;
	
	public Driver(String id, String name) {
		super(id, name);
		this.available =true;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		if(available) {
			System.out.println("Driver is available");
		}
		else {
			System.out.println("Driver is not available");
		}
	}
	@Override
	void showProfile() {
		System.out.println("The id of driver is: "+id+"\nThe name of driver is: "+name+" "+"Whether driver is availble? "+available);
		
	}
}
