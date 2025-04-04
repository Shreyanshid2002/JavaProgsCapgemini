package exceptionHandling;

public class ATMDriver {
	public static void main(String[] args) {
		ATM atm = new ATM();
		try {
			atm.withdraw(1234,500.00);
		}
		catch(InvalidATMPinException e){
			System.out.println(e.getMessage());
			
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		try {
			atm.checkbalance(1234);
		}
		catch(InvalidATMPinException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
