package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoTwo {

    public static void main(String[] args) {

        String text = "Marks: 85, 90";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
