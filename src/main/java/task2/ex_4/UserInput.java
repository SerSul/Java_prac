package task2.ex_4;

import java.util.Scanner;

public interface UserInput {
    Scanner scanner = new Scanner(System.in);

    default String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    default double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Введите корректное число: ");
            }
        }
    }
}

