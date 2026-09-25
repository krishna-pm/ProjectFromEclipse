package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternExample {

    public static void main(String[] args) {

        // Create a Pattern object
        Pattern pattern = Pattern.compile("Luminar", Pattern.CASE_INSENSITIVE);

        // Create a Matcher object
        Matcher matcher = pattern.matcher("Visit Luminar!");

        // Search the text
        boolean matchFound = matcher.find();

        
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
