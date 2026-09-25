package exceptionpack;

public class ThrowDemo {
	
	void voteEligibility(int age) {
		if(age<18) {
			throw new ArithmeticException("AGE IS LESS THAN 18");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		ThrowDemo throwDemo = new ThrowDemo();
		
		try {
			throwDemo.voteEligibility(2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
