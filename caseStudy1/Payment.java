package caseStudy1;

public abstract class Payment {
	public Payment(float amount, String transID) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.transID=transID;
	}
	abstract void processPayment();
	private float amount;
	private String transID;
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public String getTransID() {
		// TODO Auto-generated method stub
		return transID;
	}
	
	
	
	
	
	

}
