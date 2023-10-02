package task8.task3;

import java.util.Scanner;

public class NumbersFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();
        scanner.close();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
    }
}

