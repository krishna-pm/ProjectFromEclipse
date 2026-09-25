package practice;

public class ExceptionPropagationTest {
	
	void methodOne() {
		
		System.out.println("I am method one");
		methodThree();	
		System.out.println("Called method three");
		
	}
	
	void methodTwo() {
		
		System.out.println("I am method two");
		
		try{
			methodOne();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("Called method one");
	}
	
	double methodThree() {
		
		
		System.out.println("I am method three");
		
		double div =50/0;
		
		return div;
		
	}

	public static void main(String[] args) {

		ExceptionPropagationTest exceptionPropagationTest = new ExceptionPropagationTest();
		
		System.out.println("Calling method two");
		exceptionPropagationTest.methodTwo();
		
		System.out.println("End of the program");

	}

}
