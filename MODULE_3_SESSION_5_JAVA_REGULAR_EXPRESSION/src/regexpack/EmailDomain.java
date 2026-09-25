package regexpack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDomain {

    public static void main(String[] args) {

        String email = "krishna@yahoo.com";

        String regex = "@(.+)";

        Matcher matcher = Pattern.compile(regex).matcher(email);

        if (matcher.find()) {
            System.out.println("Domain : " + matcher.group(1));
        }
    }
}
