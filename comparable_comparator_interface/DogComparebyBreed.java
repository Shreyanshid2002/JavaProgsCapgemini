package comparable_comparator_interface;

import java.util.Comparator;

public class DogComparebyBreed implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		DogComparable d1 = (DogComparable) o1;
		DogComparable d2 = (DogComparable) o2;

		return d2.breed.compareTo(d1.breed);
	}

}
