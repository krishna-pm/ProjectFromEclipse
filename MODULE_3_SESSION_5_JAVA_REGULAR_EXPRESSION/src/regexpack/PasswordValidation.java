package regexpack;

import java.util.regex.Pattern;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "Java@123";

        String regex ="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        if (Pattern.matches(regex, password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
