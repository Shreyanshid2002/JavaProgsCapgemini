package exceptionHandling;

public class ATM {
	private int pin;
	private double balance;
	
	
	public void atm(int pin, double balance) {
		this.pin=pin;
		this.balance=balance;
	}
	
	public void withdraw(int pin,double amount) throws InvalidPinException, InsufficientBalanceException{
		if(this.pin==pin) {
			if(amount>balance) {
				throw new InsufficientBalanceException("InsufficientBalance");
			}
			else {
				balance-=amount;
				throw new InsufficientBalanceException("Amount withdrawn");
			}
			
		}
		
	}
	public void checkbalance(int pin) {
		if(this.pin==pin) {
			
		}
		else {
			throw new InvalidPinException("The user pin is invalid");
		}
	}


		// TODO Auto-generated method stub
		
	
}
