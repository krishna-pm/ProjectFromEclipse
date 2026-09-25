package practice;

import java.util.Scanner;

class InvalidLoginCredentials extends Exception{
	
	String s;
	
	InvalidLoginCredentials(String s){
		
		super(s);
		
		this.s=s;
	}
	
	@Override
	public String toString() {
		return "Exception : "+s;
	}
	
}
public class EmailPasswordCustomException {
	
	String currentPaasword="user1234";
	
	String currentEmailId="user@gmail.com";
	
	String givenEmailId;
	String givenPassword;
	
	void checkPassword(String givenPassword) throws InvalidLoginCredentials{
		if(givenPassword.equals(currentPaasword)) {
			System.out.println("Login succesful");
		}
		else {
			throw new InvalidLoginCredentials("INCORRECT PASSWORD");
		}
		
	}
	
	void checkEmailId(String emailId) throws InvalidLoginCredentials{
		
		if(emailId.equals(currentEmailId)) {
			
			checkPassword(givenPassword);
		}
		else {
			throw new InvalidLoginCredentials("INCORRECT EMAIL ID");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		EmailPasswordCustomException customException = new EmailPasswordCustomException();
		
		System.out.println("Email id : ");
		
		
		customException.givenEmailId=scanner.next();
	
		System.out.println("Password : ");
	
		customException.givenPassword=scanner.next();
		
		try{
			customException.checkEmailId(customException.givenEmailId);
		}
		catch(InvalidLoginCredentials i) {
			i.printStackTrace();
		}
		
		System.out.println("Thank you");
	}

}
