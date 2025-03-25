package staticAndNonstatic;


public class Demo2{
	public Demo2(){
		System.out.println(Demo1.id);
		Demo1 d= new Demo1();
		System.out.println(d.name);
		
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}		
}


