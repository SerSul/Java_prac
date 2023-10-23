package task14;

public class z4 {
    public static void main(String[] args) {
        String text = "(1+8)-9/4. Пример неправильных выражений: 6/5-2*9.";

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.matches(".*\\d.*") && !word.contains("+")) {
                System.out.println("вырабение без +: " + word);
            }
        }
    }
}
