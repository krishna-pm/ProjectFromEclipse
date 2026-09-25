package practice;

public class ThrowTest {
	
	void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("INVALID AGE");
		}else {
			System.out.println("Eligible to vote");
		}
	}

//	public static void main(String[] args) {
//		
//		System.out.println("Hello");
//		
//		ThrowTest test = new ThrowTest();
//		test.checkAge(5);
//		
//		System.out.println("Thank you");
//	}
	
	public static void main(String[] args) { 
		ThrowTest test = new ThrowTest();
		
		System.out.println("Hello");
		
		try {
			test.checkAge(5);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("Thank you");
	}

}
