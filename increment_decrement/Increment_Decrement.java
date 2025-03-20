package increment_decrement;

public class Increment_Decrement {
	public static void main(String[] args) {
		int a=2, b=5;
		int res=a++ - --a - a-- + b-- + ++b + ++a - ++b + b--;
		System.out.println(res);
	}

}
