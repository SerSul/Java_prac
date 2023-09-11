package task2.ex_8;

public class ReverseStringArray {
    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("Исходный массив:");
        printArray(stringArray);

        int left = 0;
        int right = stringArray.length - 1;


        while (left < right) {
            String temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nМассив после обмена элементов в обратном порядке:");
        printArray(stringArray);
    }


    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
