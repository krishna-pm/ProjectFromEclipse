package exceptionpack;

class InvalidCredentials extends Exception{
	
	String s;
	
	public InvalidCredentials(String s) {
		super(s);
		this.s=s;
	}
	
	@Override
	public String toString() {
		
		return "Exception caught "+s;
		
	}
	
}

public class UserDefinedException {

	
	void validateUser(int otp) throws InvalidCredentials{
		if(otp!=1234) {
			
			throw new InvalidCredentials("OTP Mismatch");
		}
		else {
			System.out.println("Login Success");
		}
	}
	
	void validateUser(String email, String password) throws InvalidCredentials {

        String validEmail = "demo@gmail.com";
        String validPassword = "Demo@123";

        if (!email.equals(validEmail)) {
            throw new InvalidCredentials("Invalid Email");
        }

        if (!password.equals(validPassword)) {
            throw new InvalidCredentials("Invalid Password");
        }

        System.out.println("Login Successful");
    }
	public static void main(String[] args) throws InvalidCredentials {
		
		UserDefinedException definedException = new UserDefinedException();
		definedException.validateUser(1234);
		
		definedException.validateUser("demo@gmail.com", "demo@123");
	}

}
