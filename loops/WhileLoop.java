package loops;

;

public class WhileLoop {
	public static void main(String[] args) {
		int n = 1234567;
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		System.out.println(c);
	}

}
