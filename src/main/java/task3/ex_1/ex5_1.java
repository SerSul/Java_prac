package task3.ex_1;

public class ex5_1 {
    public static void main(String[] args) {

        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");


        String strValue = "1.2345";
        double doubleValue = Double.parseDouble(strValue);

        double doublePrimitive = doubleObj1.doubleValue();
        float floatPrimitive = doubleObj2.floatValue();
        int intPrimitive = doubleObj1.intValue();
        long longPrimitive = doubleObj2.longValue();
        short shortPrimitive = doubleObj1.shortValue();
        byte bytePrimitive = doubleObj2.byteValue();

        System.out.println("Значение doubleObj1: " + doubleObj1);
        System.out.println("Значение doubleObj2: " + doubleObj2);

        String d = Double.toString(3.14);

        System.out.println("Значение : " + doubleValue);
        System.out.println("Преобразование  к double: " + doublePrimitive);
        System.out.println("Преобразование  к float: " + floatPrimitive);
        System.out.println("Преобразование  к int: " + intPrimitive);
        System.out.println("Преобразование  к long: " + longPrimitive);
        System.out.println("Преобразование  к short: " + shortPrimitive);
        System.out.println("Преобразование  к byte: " + bytePrimitive);
        System.out.println("Значение d: " + d);
    }
}

