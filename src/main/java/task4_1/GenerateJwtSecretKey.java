package task4_1;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class GenerateJwtSecretKey {
    public static void main(String[] args) {
        // Генерация безопасного секретного ключа для HMAC-SHA256
        byte[] apiKeySecretBytes = Keys.secretKeyFor(SignatureAlgorithm.HS256).getEncoded();

        // Преобразование байтового массива в строку для сохранения или использования
        String apiKeySecretString = new String(apiKeySecretBytes);

        System.out.println("Сгенерированный секретный ключ:");
        System.out.println(apiKeySecretString);
    }
}
