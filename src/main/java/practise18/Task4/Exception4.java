package practise18.Task4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("incorrect number format");
        } finally {
            myScanner.close();
            System.out.println("Scanner closed");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
