package task16;



import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class z1_1 extends JFrame {
    private final int maxTries = 3;
    private final int secretNumber = new Random().nextInt(21);
    private int remainingTries = maxTries;
    private JTextField textField;
    private JLabel resultLabel;
    private JLabel triesLabel;

    public z1_1() {
        setTitle("Угадай число");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        textField = new JTextField(10);
        JButton guessButton = new JButton("Угадать");
        inputPanel.add(textField, BorderLayout.CENTER);
        inputPanel.add(guessButton, BorderLayout.EAST);

        resultLabel = new JLabel("");
        triesLabel = new JLabel("Попыток осталось: " + remainingTries);

        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);
        add(triesLabel, BorderLayout.SOUTH);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    private void checkGuess() {
        try {
            int guessedNumber = Integer.parseInt(textField.getText());
            if (guessedNumber == secretNumber) {
                resultLabel.setText("Поздравляю! Вы угадали!");
                textField.setEnabled(false);
            } else {
                remainingTries--;
                if (remainingTries > 0) {
                    String message = "Вы не угадали. Число " + (guessedNumber < secretNumber ? "меньше" : "больше") + " задуманного.";
                    resultLabel.setText(message);
                    triesLabel.setText("Попыток осталось: " + remainingTries);
                } else {
                    resultLabel.setText("Вы исчерпали все попытки. Загаданное число: " + secretNumber);
                    textField.setEnabled(false);
                }
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Ошибка: Введите число от 0 до 20.");
        }
        textField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                z1_1 game = new z1_1();
                game.setVisible(true);
            }
        });
    }
}
