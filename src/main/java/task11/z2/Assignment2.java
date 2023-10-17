package task11.z2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Текущая дата +время: " + dateFormat.format(currentDate));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.MM.yyyy HH:mm:ss: ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            Date userDate = dateFormat.parse(userInput);
            if (currentDate.after(userDate)) {
                System.out.println("Текущая дата позже введенной даты.");
            } else if (currentDate.before(userDate)) {
                System.out.println("Текущая дата раньше введенной даты.");
            } else {
                System.out.println("Текущая дата совпадает с введенной датой.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при парсинге введенной даты: " + e.getMessage());
        }
    }
}

