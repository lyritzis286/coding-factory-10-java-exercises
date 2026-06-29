package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * StrongPassword with at least 12 characters.
 * 1 UpperCase ,1 lowercase, 1 digit, 1 special character
 */
public class StrongPassword {

    public static void main(String[] args) {
        String password = "C0d1ngF@@ct0ry";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])^.{12,}$");
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
