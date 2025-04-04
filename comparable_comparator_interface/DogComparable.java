package comparable_comparator_interface;

import java.util.Arrays;

public class DogComparable implements Comparable {
	String name;
	int age;
	String breed;
	
	public DogComparable(String name, int age, String breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age +" Breed: "+breed;
		
	}
	
	
	@Override
	public int compareTo(Object o) {
		DogComparable d = (DogComparable)o;
		if(this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);
		}
		if(this.age-d.age!=0) {
			return this.age-d.age;
		}
		
			return 0;

		
	}
	public static void main(String[] args) {
		DogComparable[] arr = new DogComparable[3];
		
		DogComparable dog1 = new DogComparable("Pettie",4,"Siberian Husky");
		DogComparable dog2 = new DogComparable("Goldie",5,"Alsatian");
		DogComparable dog3 = new DogComparable("Bettie",7,"German Shephard");
		arr[0] = dog1;
		arr[1] = dog2;
		arr[2] = dog3;
		
		DogComparebyBreed c = new DogComparebyBreed();
		Arrays.sort(arr,c);
//		Arrays.sort(arr,new DogComparebyBreed());
		for(DogComparable dog:arr) {
			System.out.println(dog);
		}
		
		
		
	}
	
}
