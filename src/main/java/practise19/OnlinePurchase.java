package practise19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

public class OnlinePurchase {
    public static boolean isValidINN(String inn) {
        String regex = "\\d{12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inn);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String inn;

        try {
            System.out.println("Введите ваши Имя и Фамилию: ");
            fullName = scanner.nextLine();

            System.out.println("Введите ваш ИНН:");
            inn = scanner.nextLine();

            if (!isValidINN(inn)) throw new InvalidINNException("Некорректный ИНН: " + inn);

            System.out.println("Данные введены корректно!");
            System.out.println("Добро пожаловать, " + fullName + "!");
        } catch (InvalidINNException e) {
            throw new RuntimeException(e);
        }
    }
}