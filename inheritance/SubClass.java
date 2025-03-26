package inheritance;

public class SubClass extends SuperClass {
	double a = 100000;
	static double b;
	public void Print() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(b);
		System.out.println(SuperClass.b);
	}
}
