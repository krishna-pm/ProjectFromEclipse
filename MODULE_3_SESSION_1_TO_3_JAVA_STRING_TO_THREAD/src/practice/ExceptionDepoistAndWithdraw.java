package practice;

import java.util.Scanner;

public class ExceptionDepoistAndWithdraw {
	
	double balance = 0;
	int depositAmount;
	int withdrawAmount;
	
	void deposit(int amount) throws Exception{
		
		if(amount<100) {
			throw new Exception("Cannot deposit amount less than 100 Rs/-");
		}
		else {
			balance+=amount;
			System.out.println("Rs. "+amount+" credited to your bank account");
			System.out.println("New balance : "+balance);
		}
	}
	
	void withdraw(int amount) throws Exception{
		if(amount>balance) {
			throw new Exception("Invalid balance");
		}
		else {
			balance-=amount;
			System.out.println("Rs. "+amount+" debited from you account");
			System.out.println("New balance : "+balance);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ExceptionDepoistAndWithdraw exceptionDepoistAndWithdraw = new ExceptionDepoistAndWithdraw();
		
		System.out.println("Enter the deposit amount");
		exceptionDepoistAndWithdraw.depositAmount=scanner.nextInt();
		
		try {
			exceptionDepoistAndWithdraw.deposit(exceptionDepoistAndWithdraw.depositAmount);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Thank you for banking with us");

		
		System.out.println("Enter the amount for withdrawal");
		exceptionDepoistAndWithdraw.withdrawAmount=scanner.nextInt();
		
		try {
			exceptionDepoistAndWithdraw.withdraw(exceptionDepoistAndWithdraw.withdrawAmount);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Thank you for banking with us");
	}

}
