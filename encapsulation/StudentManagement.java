package encapsulation;
import java.util.*;
public class StudentManagement {
	private String name = "Shreyanshi";
	private int age = 22;
	private String gender="Female";
	private String branch="CST";
	private String email="dasshreya1@gmail.com";
	private int password=1234;

	public void getName(int password) {
		if(this.password==password)
			System.out.println(name);
		else
			System.out.println("Invalid password");
	}
	public void setName(String name, int password) {
		if(this.password==password)
			this.name = name;
		else
			System.out.println("invalid password");
		}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public void displayDetails() {
		System.out.println(name+" "+age+" "+branch+" "+email+" ");
	}
	public void updatePassword(int password) {
		if(this.password==password) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new password: ");
			int newPassword=sc.nextInt();
			System.out.println("Confirm new password: ");
			int confirmPassword=sc.nextInt();
			if(newPassword==confirmPassword) {
				this.password=confirmPassword;
				System.out.println("password updated");
			}
			else {
			System.out.println("Confirmation of new password failed");
			}
		}
		else {
			System.out.println("Invalid password");
		}
	}
}
