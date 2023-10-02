package task8.task1;

import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        scanner.close();

        int currentNumber = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count < currentNumber) {
                System.out.print(currentNumber + " ");
                count++;
            } else {
                currentNumber++;
                count = 1;
            }
        }
    }
}
