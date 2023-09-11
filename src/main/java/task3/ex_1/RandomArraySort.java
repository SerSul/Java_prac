package task3.ex_1;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {

        int arrayLength = 10;
        double[] randomArray1 = new double[arrayLength];
        double[] randomArray2 = new double[arrayLength];


        for (int i = 0; i < arrayLength; i++) {
            randomArray1[i] = Math.random();
        }


        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomArray2[i] = random.nextDouble();
        }

        System.out.println("Исходный массив (Math.random()):");
        System.out.println(Arrays.toString(randomArray1));
        System.out.println("Исходный массив (Random):");
        System.out.println(Arrays.toString(randomArray2));


        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);


        System.out.println("Отсортированный массив (Math.random()):");
        System.out.println(Arrays.toString(randomArray1));
        System.out.println("Отсортированный массив (Random):");
        System.out.println(Arrays.toString(randomArray2));
    }
}
