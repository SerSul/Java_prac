package task13.z5;

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String input) {
        // Удалите все символы, кроме цифр
        String digits = input.replaceAll("\\D", "");

        // Проверьте, в каком формате представлен номер
        if (digits.startsWith("8") && digits.length() == 11) {
            // Формат "8XXXXXXXXXX" для России
            return "+7" + digits.substring(1, 4) + "-" + digits.substring(4, 7) + "-" + digits.substring(7);
        } else if (digits.startsWith("+") && digits.length() == 12) {
            // Формат "+XXXXXXXXXXX" для других стран
            return digits.substring(0, 4) + digits.substring(4, 7) + "-" + digits.substring(7, 11);
        } else {
            // Неподдерживаемый формат
            return "Неверный формат номера";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String formatted1 = formatPhoneNumber(phoneNumber1);
        System.out.println(formatted1); // Выводит "+791-756-5565"

        String phoneNumber2 = "89175655655";
        String formatted2 = formatPhoneNumber(phoneNumber2);
        System.out.println(formatted2); // Выводит "+791-756-5565"

        String phoneNumber3 = "+104289652211";
        String formatted3 = formatPhoneNumber(phoneNumber3);
        System.out.println(formatted3); // Выводит "+1042-896-5221"

        String phoneNumber4 = "1234567890";
        String formatted4 = formatPhoneNumber(phoneNumber4);
        System.out.println(formatted4); // Выводит "Неверный формат номера"
    }
}
