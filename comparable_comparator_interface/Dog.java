package comparable_comparator_interface;

import java.util.Arrays;

public class Dog {
	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age;
		
	}
	public static void main(String[] args) {
		Dog[] arr = new Dog[3];
		
		Dog dog1 = new Dog("Siberian Husky",4);
		Dog dog2 = new Dog("Alsatian",5);
		Dog dog3 = new Dog("German Shephard",7);
		arr[0] = dog1;
		arr[1] = dog2;
		arr[2] = dog3;
		
//		Arrays.sort(arr);
		for(Dog dog:arr) {
			System.out.println(dog);
			
		}
		
		
	}
}
