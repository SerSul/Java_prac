package practise18.Task2;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("incorrect number format");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}

// 1) qwerty - NumberFormatException: For input string: "qwerty"
//    0 - Process finished with exit code 0
//    0.1 - NumberFormatException: For input string: "0.1"
//    1 - Process finished with exit code 0
// 2) incorrect number format