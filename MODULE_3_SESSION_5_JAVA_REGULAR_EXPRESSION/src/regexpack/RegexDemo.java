package regexpack;

import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

    	
    	 System.out.println(Pattern.matches("^[6-9]\\d{9}$", "9953038949")); 
    	 
        System.out.println(Pattern.matches("^[6789][0-9]{9}$", "5953038949"));  // true

        System.out.println(Pattern.matches("^[6789][0-9]{9}$", "99530389490")); // false

        System.out.println(Pattern.matches("^[6789][0-9]{9}$", "5953038949"));  // false

        System.out.println(Pattern.matches("^[6789][0-9]{9}$", "8853038949"));  // true

    }
}
