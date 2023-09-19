package task4_1;

class Shape {
    public String getType() {
        return "Фигура";
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Тип: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}

public class z1 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Square(3.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
