package stringpack;

public class PalindromeString {

	public static void main(String[] args) {


		String word = "MALAYALAM";
		String pal= "";
		
		for(int i=word.length()-1;i>=0;i--) {
			pal+=word.charAt(i);
		}
		if(word.equalsIgnoreCase(pal)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
