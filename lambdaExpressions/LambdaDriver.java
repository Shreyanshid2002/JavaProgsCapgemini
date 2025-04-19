package lambdaExpressions;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo l1 = () -> System.out.println("Hello");
		l1.print();
		Demo2 l2 = () -> System.out.println("Hello");
		l2.greet();
	}
}
