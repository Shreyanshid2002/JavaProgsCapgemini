package scannerClass;

import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Integer");
//		int num=sc.nextInt();
//		System.out.println(num);
//		System.out.println("Enter Byte");
//		System.out.println();
//		System.out.println("Enter Boolean");
//		System.out.println(sc.nextBoolean());
//		System.out.println("Enter Short");
//		System.out.println(sc.nextShort());
//		System.out.println("Enter Long");
//		System.out.println(sc.nextLong());
//		System.out.println("Enter Float");
//		System.out.println(sc.nextFloat());
//		System.out.println("Enter Double");
//		System.out.println(sc.nextDouble());
//		System.out.println("Enter name");
//		System.out.println(sc.next());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println(x);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		System.out.println(s);
		
	}

}
