package task2.ex_6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для расчета длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Метод для сравнения двух окружностей
    public boolean isEqualTo(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }
}


