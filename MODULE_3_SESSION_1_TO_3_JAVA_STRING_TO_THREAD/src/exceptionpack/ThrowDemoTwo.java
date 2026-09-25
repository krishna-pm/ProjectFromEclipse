package exceptionpack;
import java.util.Scanner;

public class ThrowDemoTwo {
	
	double[] arr = new double[5];
	
	void calculateDivision(int numOne,int numTwo,int arrayPosition) throws ArithmeticException{
		double result=0;
		
		if(numTwo<=0) {
			throw new ArithmeticException("NUMBER IS LESS THAN OR EQUAL TO ZERO");
		}else {
			result=numOne/numTwo;
		}
		
		saveToArray(result,arrayPosition);
	}
	
	void saveToArray(double result,int arrayPosition) {
		
		if(arrayPosition>arr.length) {
			throw new ArrayIndexOutOfBoundsException("ARRAY LENGTH EXCEEDS");
		}
		else {
			arr[arrayPosition]=result;
		}
		
		System.out.println("Array elements are ");
		for(double i : arr) {
			System.out.println(i);
		}
		
	}
	
	

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		ThrowDemoTwo demoTwo = new ThrowDemoTwo();
		
		try {
			System.out.println("Enter first number : ");
			System.out.println("Enter second number : ");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter array position : ");
		
		demoTwo.calculateDivision(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
	}

}
