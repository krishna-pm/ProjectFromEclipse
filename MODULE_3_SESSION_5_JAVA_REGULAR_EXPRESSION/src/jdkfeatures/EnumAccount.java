package jdkfeatures;

import java.util.Scanner;

enum Account{
	SAVINGS,CURRENT,CREDIT
}

class AccountType{
	Account type;

	public AccountType(Account type) {
		this.type = type;
	}	
	
	public void accountCoverage() {
		switch(type) {
		case SAVINGS:
			System.out.println("You have to maintain RS.1000/- balance in your account");
			break;
		case CURRENT:
			System.out.println("You have to maintain RS.15000/- balance in your account");
			break;
		case CREDIT:
			System.out.println("Minimum balance is not required");
			break;
		default:
			System.out.println("Invalid account type");	
		}
	}
	}
public class EnumAccount {

	public static void main(String[] args) {

		AccountType aType;
		char choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("========= ACCOUNT TYPE =====");
			System.out.println("1. SAVINGS");
			System.out.println("2. CURRENT");
			System.out.println("3. CREDIT");
			System.out.println("4. EXIT");
			System.out.println("Select your account type");
			int ac=sc.nextInt();
			
			switch(ac) {
			case 1:
				aType=new AccountType(Account.SAVINGS);
				aType.accountCoverage();
				break;
			case 2:
				aType=new AccountType(Account.CURRENT);
				aType.accountCoverage();
				break;
			case 3:
				aType=new AccountType(Account.CREDIT);
				aType.accountCoverage();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?y/n");
			choice=sc.next().charAt(0);
			if(choice=='y'||choice=='Y')
				continue;
			else
				break;
			
		}while(true);
		

	}

}
