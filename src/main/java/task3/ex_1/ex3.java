package task3.ex_1;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}

