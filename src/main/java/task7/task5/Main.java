package task7.task5;

public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringManipulator();

        String inputString = "Hello, World!";

        int characterCount = stringUtils.countCharacters(inputString);
        System.out.println("коо-во букав: " + characterCount);

        String oddPositionChars = stringUtils.oddPositionCharacters(inputString);
        System.out.println("нечетные позиции: " + oddPositionChars);

        String reversedString = stringUtils.reverseString(inputString);
        System.out.println("реверснутая: " + reversedString);
    }
}
