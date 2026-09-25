package exceptionpack;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		
		try {
			int result = 50/0;
			System.out.println("Result : "+result);
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e);
		}
			
		System.out.println("Thank you");

	}

}
