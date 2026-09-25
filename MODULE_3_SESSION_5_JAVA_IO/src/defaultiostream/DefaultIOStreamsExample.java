package defaultiostream;

public class DefaultIOStreamsExample {

	public static void main(String[] args) {


		try {
			int data =30/0;
		}catch(ArithmeticException e) {
			System.out.println("Error");
			System.err.println("Error");
		}
		
		System.out.println("Program completed");

	}

}
