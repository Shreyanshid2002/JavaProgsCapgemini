package wrapperclass;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i); //BOXING
		System.out.println("x: "+x);
		Integer z=Integer.valueOf(i);
		
		Integer y=i; //AUTOBOXING
		System.out.println("y: "+y);
		
		int a = y.intValue(); //UNBOXING
		Boolean flag = true;
		boolean b = flag.booleanValue();
		System.out.println("a: "+a+"b: "+b);
		
		
		Character ch = 'a'; //AUTO_BOXING
		char c = ch; //AUTO_UNBOXING
		
		Byte byt =20;
		Byte by = Byte.valueOf(byt);
		System.out.println("b: "+b);
		
		
		Integer v = 10;
		Integer j = 10;
		System.out.println(v==j);
	}
}
