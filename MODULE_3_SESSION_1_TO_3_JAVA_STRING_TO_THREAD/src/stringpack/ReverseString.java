package stringpack;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Luminar Technolab";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev+=name.charAt(i);
			
		}
		
		System.out.println("Reverse : "+rev);
		
	}

}
