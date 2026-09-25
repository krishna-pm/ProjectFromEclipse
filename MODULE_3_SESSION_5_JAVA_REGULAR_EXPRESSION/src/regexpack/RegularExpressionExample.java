package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(".s"); //  dot - a single character 
		Matcher matcher = pattern.matcher("as"); // Ex - as,As,9s,#s, s(space s)
		boolean flagFirst=matcher.matches();
		
		System.out.println(flagFirst);
		
		
		//2nd way
		
		boolean flagSecond=Pattern.compile(".s").matcher("as").matches();
		System.out.println(flagSecond);
		
		//3rd way
		
		boolean flagThird = Pattern.matches(".s", "as");
		System.out.println(flagThird);
	}

}
