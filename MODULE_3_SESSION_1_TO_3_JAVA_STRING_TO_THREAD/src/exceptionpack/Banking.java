package exceptionpack;

public class Banking {
	
	double balance=0;
	
	public void deposit(double amount) throws ArithmeticException{
		
		if(amount>=500) {
			
			balance+=amount;
			System.out.println("Balance after deposit : "+balance);
		}else {
			throw new ArithmeticException("Minimum deposit amount is Rs.500");
		}
		}
	
	public void withdraw(double amount,String pin) throws ArithmeticException,IllegalArgumentException{
		if(pin.length()!=4) {
			throw new IllegalArgumentException("Invalid Pin");
		}else {
		if(amount>balance) {
			throw new ArithmeticException("Insufficient balance");
		}else {
		
		balance-=amount;
		System.out.println("Balance after withdrawal : "+balance);

		}
	}
	}

	public static void main(String[] args) throws Exception {
		
		Banking banking = new Banking();
		
		banking.deposit(1000);
		
		banking.withdraw(500,"3435");
		
	}

}
