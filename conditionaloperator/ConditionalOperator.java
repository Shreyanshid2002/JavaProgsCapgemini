package conditionaloperator;

public class ConditionalOperator {
	public static void main(String[] args) {
		//System.out.println(res=10>20?10:20);
		//System.out.println(10>20?"10 is greater":20);
		int a = 100 , b = 90 , c = 120;
		System.out.println(a>b&&a>c?a:((b>a&&b>c)?b:c));
	}

}
