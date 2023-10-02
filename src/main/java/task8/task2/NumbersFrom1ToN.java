package task8.task2;

import java.util.Scanner;

public class NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
