package jdkfeatures;

public class VarArgsExample {

	public static void printNumbers(int... numbers) {
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	public static void printString(String...strings) {
		for(String str:strings) {
			System.out.print(str+" ");
		}
		System.out.println();
	}
	public static void main(String...args) {

		for(String arg:args) {
			System.out.print(arg+" ");
		}
		
		printNumbers(1,2,3);
		printNumbers(10,20,30,40,50);

	}

}
