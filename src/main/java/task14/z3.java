package task14;

import java.util.regex.*;

public class z3 {
    public static void main(String[] args) {
        String text = "25.98 USD, 1000 RUB, 44.55 EU. 44 ERR, 0.004 EU.";

        String usdPattern = "(\\d+\\.\\d{2}) USD";
        String rubPattern = "(\\d+) RUB";
        String euPattern = "(\\d+\\.\\d{2}) EU";

        Pattern usdRegex = Pattern.compile(usdPattern);
        Pattern rubRegex = Pattern.compile(rubPattern);
        Pattern euRegex = Pattern.compile(euPattern);

        Matcher matcher = usdRegex.matcher(text);

        while (matcher.find()) {
            String usdPrice = matcher.group(1);
            System.out.println(" цена в USD: " + usdPrice);
        }

        matcher = rubRegex.matcher(text);
        while (matcher.find()) {
            String rubPrice = matcher.group(1);
            System.out.println(" цена в RUB: " + rubPrice);
        }

        matcher = euRegex.matcher(text);
        while (matcher.find()) {
            String euPrice = matcher.group(1);
            System.out.println("Найдена цена в EU: " + euPrice);
        }
    }
}
