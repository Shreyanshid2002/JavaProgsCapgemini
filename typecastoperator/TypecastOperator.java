package typecastoperator;

public class TypecastOperator {
	public static void main(String[] args) {
		//WIDENING
		byte b = 5;
		short s = (short)b;
		int i = (int) s;
		int a = 10;
		long l = 10l;
		int x = (int) l;
		float f = 20f;
		char cc='a';
		int cv = cc;
		System.out.println(cv);
		double d = (double)f; 
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(2/0.0);
		
		
		//NAROWING
		float g = 10.5f;
		long ll = (long) g;
		System.out.println(ll);
		int ii = 67;
		char c = (char) ii;
		System.out.println(c);
		double dd = 10.00d;
		char car =(char) dd;
		System.out.println(car);
	}
}
