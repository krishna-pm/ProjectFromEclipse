package practice;

public class ExceptionTestTwo {

	public static void main(String[] args) {


		System.out.println("Hello");
		
		try {
			int result=10/0;
			System.out.println(result);
			
			int[] arr= {1,2,3,4};
			System.out.println(arr[7]);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			ar.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		//ANOTHER METHOD
//		try {
//			
//			try {
//				int result=10/0;
//		
//				System.out.println(result);
//			}
//			catch(ArithmeticException ae) {
//				ae.printStackTrace();
//			}
//			
//			try {
//		
//				int[] arr= {1,2,3,4};
//				System.out.println(arr[7]);
//			}
//			catch(ArrayIndexOutOfBoundsException ar) {
//				ar.printStackTrace();
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Thank you");	
	}
}
