package stringBuffer;

public class Shreyanshi {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hi");
		sb.append(false);
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello world");
		System.out.println(sb1);
		
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		
		char[] arr = {'a','b','c','d'};
		StringBuffer sb2 = new StringBuffer(150);
		sb2.append(arr);
		System.out.println(sb2);
	
		
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(189);
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("hello");
		sb3.insert(4, arr,1,2);
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
		sb3.setCharAt(1, 'z');
		System.out.println(sb3);
	}
}

