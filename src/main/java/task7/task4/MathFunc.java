package task7.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double calculateComplexModulus(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }

    // Дополнительные методы, например, вычисление длины окружности
    public double calculateCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }
}