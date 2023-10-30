package practise20;

public class GenericTester {
    public static void main(String[] args) {
        GenericClass<Double, Double, String> genericClass = new GenericClass<Double, Double, String>(25.5, 2.5, "I'm generic");
        System.out.println(genericClass);
    }
}
