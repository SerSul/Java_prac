package task5.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class AnimationWindow extends JPanel {
    private List<BufferedImage> frames = new ArrayList<>();
    private int currentFrame = 0;
    private Timer timer;

    public AnimationWindow() {
        loadFrames(); // Загрузка кадров анимации
        timer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % frames.size();
            repaint();
        });
        timer.start();
    }

    private void loadFrames() {
        // Load animation frames
        for (int i = 1; i <= 5; i++) {
            try {
                String framePath = "frame" + i + ".png"; // Remove leading slash
                BufferedImage frame = ImageIO.read(getClass().getResource(framePath));
                if (frame != null) {
                    frames.add(frame);
                } else {
                    System.err.println("Error loading frame: " + framePath);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage currentImage = frames.get(currentFrame);
        g.drawImage(currentImage, 0, 0, null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animation");
            AnimationWindow animationWindow = new AnimationWindow();
            frame.add(animationWindow);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
