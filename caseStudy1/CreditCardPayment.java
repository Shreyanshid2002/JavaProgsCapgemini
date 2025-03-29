package caseStudy1;

public class CreditCardPayment extends Payment {
	public CreditCardPayment(float amount, String transID ) {
		super( amount, transID);
		// TODO Auto-generated constructor stub
	}

	@Override
	void processPayment() {
		// TODO Auto-generated method stub
		String tid = super.getTransID();
		double a = super.getAmount();
		double disc = 0;
		if(a>500.00) {
			disc = (a*10)/100;
		}
		else {
			System.out.println("No discount is applied");
		}
		double transfee = (a*2)/100;
		double payamt = a-disc+transfee;
		System.out.println("Processing PayPal Payment...");
		System.out.println("Transaction ID: "+tid);
		System.out.println("Original Amount: $"+a);
		System.out.println("Discount Applied: $"+disc);
		System.out.println("Transaction Fee: $"+transfee);
		System.out.println("Final Payable Amount: $"+payamt);
		System.out.println("PayPal Payment Successful");
	}

}
