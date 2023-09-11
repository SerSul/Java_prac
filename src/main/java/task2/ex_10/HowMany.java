package task2.ex_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String inputText = scanner.nextLine();

        int wordCount = countWords(inputText);

        System.out.println("Количество слов в введенном тексте: " + wordCount);
    }

    public static int countWords(String text) {

        text = text.trim().replaceAll("\\p{Punct}", " ");


        String[] words = text.split("\\s+");

        return words.length;
    }
}
