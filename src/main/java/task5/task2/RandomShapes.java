package task5.task2;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class RandomShapes extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Random random = new Random();

    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            int shapeType = random.nextInt(2); // 0 for Circle, 1 for Rectangle

            if (shapeType == 0) {
                int radius = random.nextInt(50) + 20; // Random radius between 20 and 70
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int width = random.nextInt(100) + 50; // Random width between 50 and 150
                int height = random.nextInt(100) + 50; // Random height between 50 and 150
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapes randomShapes = new RandomShapes();
        frame.add(randomShapes);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}