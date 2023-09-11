package task2.ex_3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count++] = circle;
        } else {
            System.out.println("The array is full. Cannot add more circles.");
        }
    }

    public int getCount() {
        return count;
    }

    public Circle getCircle(int index) {
        if (index >= 0 && index < count) {
            return circles[index];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        Point center1 = new Point(1.0, 2.0);
        Circle circle1 = new Circle(center1, 3.0);

        Point center2 = new Point(0.0, 0.0);
        Circle circle2 = new Circle(center2, 2.5);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        System.out.println("Number of circles: " + tester.getCount());

        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println("task3.Circle " + (i + 1) + ": " + tester.getCircle(i));
        }
    }
}
