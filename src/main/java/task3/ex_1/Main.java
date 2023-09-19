package task3.ex_1;

import java.util.Arrays;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle [Center: " + center + ", Radius: " + radius + "]";
    }
}


class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей заполнен.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
        return circles[0];
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c2.getRadius(), c1.getRadius()));
        return circles[0];
    }

    public void orderCirclesByRadius() {
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Point center1 = new Point(0, 0);
        Circle circle1 = new Circle(center1, 5);

        Point center2 = new Point(2, 2);
        Circle circle2 = new Circle(center2, 3);

        Point center3 = new Point(-1, -1);
        Circle circle3 = new Circle(center3, 4);

        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.addCircle(circle3);

        System.out.println("Самая маленькая окружность: " + tester.findSmallestCircle());
        System.out.println("Самая большая окружность: " + tester.findLargestCircle());

        System.out.println("Сортировка по радиусу:");
        tester.orderCirclesByRadius();
        tester.displayCircles();
    }
}
