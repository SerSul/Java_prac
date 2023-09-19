package task3.ex_1;
import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста, введите натуральное число больше 0.");
                System.out.print("Введите размер массива: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array1 = new int[n];
        Random random = new Random();

        System.out.print("Массив из " + n + " случайных целых чисел: ");
        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(n + 1);
            System.out.print(array1[i] + " ");
        }

        int count = 0; // Количество четных элементов
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                count++;
            }
        }

        if (count > 0) {
            int[] array2 = new int[count];
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (array1[i] % 2 == 0) {
                    array2[index] = array1[i];
                    index++;
                }
            }

            System.out.print("\nМассив из четных элементов первого массива: ");
            for (int i = 0; i < count; i++) {
                System.out.print(array2[i] + " ");
            }
        } else {
            System.out.println("\nВ первом массиве нет четных элементов.");
        }
    }
}
