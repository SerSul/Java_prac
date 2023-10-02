package task7.task4;

public class Main {
    public static void main(String[] args) {

        MathCalculable mathCalculable = new MathFunc();


        double powerResult = mathCalculable.calculatePower(2, 3);
        double complexModulusResult = mathCalculable.calculateComplexModulus(3, 4);
        double piValue = mathCalculable.getPI();

        System.out.println("2^3 = " + powerResult);
        System.out.println("Modulus of 3+4i = " + complexModulusResult);
        System.out.println("PI = " + piValue);

        double circleLength = ((MathFunc) mathCalculable).calculateCircleLength(5);
        System.out.println("Circle length with radius 5 = " + circleLength);
    }
}