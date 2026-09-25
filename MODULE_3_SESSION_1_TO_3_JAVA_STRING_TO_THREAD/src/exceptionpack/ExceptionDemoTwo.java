package exceptionpack;

public class ExceptionDemoTwo {

	public static void main(String[] args) { 

		System.out.println("Hello World");
		
		try {
			
			try{
				int result=50/0;
				System.out.println("Result : "+result);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			
			try {
					int[] arr = {1,2,3,4,5};
					System.out.println(arr[5]);
		
				}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}catch(Exception e ) {
					e.printStackTrace();
		}
	
		
		System.out.println("Thank you");

	}

}
