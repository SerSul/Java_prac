package task6.task1;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int speed) {
        topLeft = new MovablePoint(x1, y1, speed, speed);
        bottomRight = new MovablePoint(x2, y2, speed, speed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 1);

        System.out.println("Прямоугольник: " + rectangle);

        rectangle.moveRight();
        rectangle.moveDown();

        System.out.println("Перемещенный Прямоугольник: " + rectangle);
    }
}
