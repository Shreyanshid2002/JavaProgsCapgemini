package methodReference;

public class Driver {
	public static void main(String[] args) {
		Demo d = System.out:: println;
		d.print("Hello world");
		System.out.println("------------------------------------");
		Driver driver = new Driver();
		Test t = driver::print;
		t.greet(5,"Welcome");
		System.out.println("------------------------------------");
		Table t1 = Driver::printtable;
		t1.printtable(5);
	}
	public void print(int number, String message) {
		for(int i=0;i<number;i++) {
			System.out.println(message);
		}
	}
	public static void printtable(int x) {
		for(int i=1;i<=x;i++) {
			System.out.println(i*x);
		}
	}
}
