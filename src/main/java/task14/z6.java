package task14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class z6 {
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println(email + " - Допустимый ");
            } else {
                System.out.println(email + " - Недопустимый");
            }
        }
    }
}
