package practice;


class InvalidCredentials extends Exception{
	
	String str;
	
	InvalidCredentials(String str){
		
		super(str);
		this.str=str;
	}
	
	@Override
	public String toString() {
		
		return "Exception : "+str;
	}
	
}


public class CustomExceptionOTPValid {
	
	
	void validateOTP(int otp) throws InvalidCredentials{
		
		if(otp!=1234) {
			
			throw new InvalidCredentials("Invalid OTP");
		}
		else {
			System.out.println("Login Success");
		}
	}

	public static void main(String[] args) {
		
		CustomExceptionOTPValid customExceptionOTPValid = new CustomExceptionOTPValid();

		try {
			customExceptionOTPValid.validateOTP(3456);
		}
		catch(InvalidCredentials i) {
			i.printStackTrace();
		}

	}

}
