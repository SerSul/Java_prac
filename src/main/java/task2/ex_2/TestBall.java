package task2.ex_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0, 0.0);

        System.out.println("Initial Ball: " + ball);

        ball.move(2.0, 3.0); // Перемещаем мяч на координаты (2.0, 3.0)
        System.out.println("Ball after moving: " + ball);

        ball.setX(1.0); // Устанавливаем новую координату X
        ball.setY(2.0); // Устанавливаем новую координату Y
        System.out.println("Ball after changing position: " + ball);
    }
}
