package task14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class z7 {
    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
        };

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println(password + " - Надежный пароль.");
            } else {
                System.out.println(password + " - Ненадежный пароль.");
            }
        }
    }
}
