package task6.task1;

public class Main {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(0, 0);
        System.out.println("Начальная точка: " + point);


        point.moveUp();
        point.moveRight();
        System.out.println("Перемещенная точка: " + point);


        MovableCircle circle = new MovableCircle(3, 4, 5);
        System.out.println("Начальный круг: " + circle);


        circle.moveDown();
        circle.moveLeft();
        System.out.println("Перемещенный круг: " + circle);
    }
}

