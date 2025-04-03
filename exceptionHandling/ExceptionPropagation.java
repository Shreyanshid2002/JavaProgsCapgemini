package exceptionHandling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		
		alpha();
	}

	public static void alpha() {
		System.out.println("This is alpha");
		beta();
	}
	public static void beta() {
		System.out.println("This is beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("This is gamma");
		System.out.println(10/0);
	}
	
}
