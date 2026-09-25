package regexpack;

import java.util.regex.Pattern;

public class RegexNextExample {

	public static void main(String[] args) {
		
		System.out.println("Metacharacter \\d (Single Digit)");
        System.out.println("-------------------------------");

        // \d = single digit (0-9)

        System.out.println(Pattern.matches("\\d", "a")); // false
        System.out.println(Pattern.matches("\\d", "1")); // true
        System.out.println(Pattern.matches("\\d", "9")); // true
        System.out.println(Pattern.matches("\\d", "@")); // false
        System.out.println(Pattern.matches("\\d", "12")); // false (2 digits)

        System.out.println();

        System.out.println("Metacharacter \\D (Single Non-Digit)");
        System.out.println("------------------------------------");

        // \D = single non-digit

        System.out.println(Pattern.matches("\\D", "1")); // false
        System.out.println(Pattern.matches("\\D", "m")); // true
        System.out.println(Pattern.matches("\\D", "@")); // true
        System.out.println(Pattern.matches("\\D", "A")); // true
        System.out.println(Pattern.matches("\\D", "ab")); // false (2 characters)

        
        System.out.println(Pattern.matches("[abc]", "d"));
	}

}
