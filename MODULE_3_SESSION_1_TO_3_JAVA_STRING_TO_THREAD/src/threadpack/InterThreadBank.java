package threadpack;


class InterThreadCustomer{
	
	int amount=10000;
	
	synchronized void withdraw(int withdrawAmount) {
		System.out.println("Going to withdraw");
		
		if(withdrawAmount>this.amount) {
			System.out.println("Insufficient Balance");
			
			try {
				wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			this.amount-=withdrawAmount;
			
			System.out.println(withdrawAmount+" withdrawed succesfully");
		}
	}
	
	synchronized void deposit(int depositAmount) {
		System.out.println("Going to deposit");
		
			this.amount+=depositAmount;
			
			System.out.println(depositAmount+ " deposited succesfully");
			notify();
		}
	}




public class InterThreadBank {

	public static void main(String[] args) {

		InterThreadCustomer customer = new InterThreadCustomer();
		
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}

}
