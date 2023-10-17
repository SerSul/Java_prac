package task13.z6;

import java.io.*;
import java.util.*;

public class WordReordering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try {
            List<String> words = readWordsFromFile(fileName);
            List<String> reorderedWords = getReorderedWords(words);
            printReorderedWords(reorderedWords);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            words.addAll(Arrays.asList(line.split(" ")));
        }
        reader.close();
        return words;
    }

    private static List<String> getReorderedWords(List<String> words) {
        if (words.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> reorderedWords = new ArrayList<>();
        reorderedWords.add(words.get(0));

        for (int i = 1; i < words.size(); i++) {
            String lastWord = reorderedWords.get(reorderedWords.size() - 1).toLowerCase();
            for (int j = 0; j < words.size(); j++) {
                if (!reorderedWords.contains(words.get(j)) && lastWord.charAt(lastWord.length() - 1) == words.get(j).toLowerCase().charAt(0)) {
                    reorderedWords.add(words.get(j));
                    break;
                }
            }
        }

        return reorderedWords;
    }

    private static void printReorderedWords(List<String> words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

