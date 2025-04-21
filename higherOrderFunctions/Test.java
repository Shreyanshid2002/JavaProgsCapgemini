package higherOrderFunctions;

public class Test {
	static void greet(Demo d) {
		d.print();
	}
	public static void main(String[] args) {
		greet(()->System.out.println("Hello"));
	}
}
