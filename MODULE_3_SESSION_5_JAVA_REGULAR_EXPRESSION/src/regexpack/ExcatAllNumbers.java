package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcatAllNumbers {

    public static void main(String[] args) {

        String text = "Price: 120, Discount: 25, Tax: 8";

        Matcher match = Pattern.compile("\\d+").matcher(text);

        while (match.find()) {
            System.out.println("Found number: " + match.group());
        }
    }
}
