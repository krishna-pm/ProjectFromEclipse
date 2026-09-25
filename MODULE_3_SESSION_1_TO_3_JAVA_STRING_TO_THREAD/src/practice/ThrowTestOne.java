package practice;

import java.util.Scanner;

public class ThrowTestOne {

	int numOne;
	int numTwo;
	double divResult;
	double[] arr = new double[3];
	
	void divide(int numOne,int numTwo) throws ArithmeticException{
		
		if(numTwo==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		else {
			divResult = numOne/numTwo;
		}
	}
	
	void insertValue(int index) throws ArrayIndexOutOfBoundsException{
		
		if(index<=arr.length-1 && index>=0) {
			arr[index]=divResult;
			System.out.println("Array Value inserted at index position : "+index + " and value : "+arr[index]);
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Invalid array index");
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ThrowTestOne throwTestOne = new ThrowTestOne();
		System.out.println("Enter the first number : ");
		throwTestOne.numOne = scanner.nextInt();
		System.out.println("Enter the second number : ");
		throwTestOne.numTwo=scanner.nextInt();
		
		try {
			throwTestOne.divide(throwTestOne.numOne,throwTestOne.numTwo);
			
			System.out.println("Enter the array index : ");
			throwTestOne.insertValue(scanner.nextInt());
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			ar.printStackTrace();
		}
		
		System.out.println("End of program");
	}

}
