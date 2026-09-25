package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		
		//Literal way of string creation
		String name = "Ann";
		
		char[] letters = {'A','N','N'};
		
		String s = new String(letters);
		
		System.out.println("Name : "+name);
		System.out.println("S : "+s);

	}

}
