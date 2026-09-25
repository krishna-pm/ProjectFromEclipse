package practice;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			int result=50/0;
			System.out.println(result);
		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Thank you");

	}

}
