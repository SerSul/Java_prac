package practise18.Task1;

public class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}

// 1) 2/0 - / by zero
// 2) 2.0/0.0 - infinity
// 3) 2/0 - Attempted division by zero
//    2.0/0.0 - infinity
