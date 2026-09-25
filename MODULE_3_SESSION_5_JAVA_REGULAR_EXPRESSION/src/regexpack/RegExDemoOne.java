package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemoOne {

    public static void main(String[] args) {

        String text = "Date: 08-04-2026";

       // String regex = "(\\d{2})-(\\d{2})-(\\d{4})";

        String regex = "(\\d{2})\\s-\\s(\\d{2})\\s-\\s(\\d{4})\\s(\\d{2}):(\\d{2})";
     
        Matcher matcher = Pattern.compile(regex).matcher(text);

        if (matcher.find()) {

            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
            System.out.println(matcher.group(5));
        }
    }
}
