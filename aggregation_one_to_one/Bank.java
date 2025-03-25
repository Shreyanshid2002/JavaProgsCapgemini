package aggregation_one_to_one;

public class Bank {
	
		String bName;
		Customer c;
		public Bank(String bName, Customer c) {
			this.bName=bName;
			this.c = c;
			
		}
		public void display() {
			System.out.println(this.bName+" "+this.c.cName);
		}
	}


