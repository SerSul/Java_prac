package task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class z1 extends JFrame {
    private int secretNumber;
    private int attempts = 0;
    private final int maxAttempts = 3;

    private JTextField guessField;
    private JLabel resultLabel;

    public z1() {
        setTitle("Игра");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        secretNumber = new Random().nextInt(21);

        JLabel instructionLabel = new JLabel("Попробуйте угадать число от 0 до 20. У вас 3 попытки.");
        add(instructionLabel, BorderLayout.NORTH);

        guessField = new JTextField(10);
        add(guessField, BorderLayout.CENTER);

        JButton guessButton = new JButton("Попробовать угадать");
        guessButton.addActionListener(new GuessButtonListener());
        add(guessButton, BorderLayout.SOUTH);

        resultLabel = new JLabel("");
        add(resultLabel, BorderLayout.EAST);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                String message = "";
                if (e.getSource() == guessField) {
                    message = "Добро пожаловать в ЦАО";
                } else if (e.getSource() == guessButton) {
                    message = "Добро пожаловать в ЗАО";
                } else if (e.getSource() == resultLabel) {
                    message = "Добро пожаловать в ЮАО";
                } else if (e.getSource() == instructionLabel) {
                    message = "Добро пожаловать в САО";
                } else {
                    message = "Добро пожаловать в ВАО";
                }

                JOptionPane.showMessageDialog(null, message);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private class GuessButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (attempts < maxAttempts) {
                try {
                    int guess = Integer.parseInt(guessField.getText());

                    if (guess == secretNumber) {
                        resultLabel.setText("Поздравляем, вы угадали число!");
                        guessField.setEditable(false);
                    } else if (guess < secretNumber) {
                        resultLabel.setText("Число больше.");
                    } else {
                        resultLabel.setText("Число меньше.");
                    }

                    attempts++;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Введите корректное число.");
                }
            } else {
                resultLabel.setText("Вы исчерпали все попытки. Загаданное число: " + secretNumber);
                guessField.setEditable(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            z1 game = new z1();
            game.setVisible(true);
        });
    }
}
