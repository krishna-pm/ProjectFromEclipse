package regexpack;

import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {

		String pattern = ".*park.*";
		String content = "This is Bini from infopark";

		boolean isMatch = Pattern.matches(pattern, content);

		System.out.println("The text contains 'park'? " + isMatch);
	}

}
