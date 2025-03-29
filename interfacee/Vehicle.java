package interfacee;

public interface Vehicle {
	int speed =10;
	void print();
	void start();
	static void utility() {
		System.out.println("utility");
		
	}
	public static void main(String[] args) {
		utility();
	}
	default void text() {
		System.out.println("default method");
	}
}
