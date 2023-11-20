package prac22;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@EqualsAndHashCode(callSuper = true)
@Data
public class CalculatorGUI extends JFrame {

    private JTextField display;
    private String currentInput = "";
    private double result = 0.0;
    private String operator = "";

    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            switch (command) {
                case "=":
                    calculateResult();
                    break;
                case ".":
                    handleDot();
                    break;
                default:
                    currentInput += command;
                    display.setText(currentInput);
                    break;
            }
        }

        private void calculateResult() {
            try {
                double inputNumber = Double.parseDouble(currentInput);
                switch (operator) {
                    case "+":
                        result += inputNumber;
                        break;
                    case "-":
                        result -= inputNumber;
                        break;
                    case "*":
                        result *= inputNumber;
                        break;
                    case "/":
                        if (inputNumber != 0) {
                            result /= inputNumber;
                        } else {
                            display.setText("Error");
                            return;
                        }
                        break;
                    default:
                        result = inputNumber;
                        break;
                }
                display.setText(String.valueOf(result));
                currentInput = "";
                operator = "";
            } catch (NumberFormatException e) {
                display.setText("Error");
            }
        }

        private void handleDot() {
            if (!currentInput.contains(".")) {
                currentInput += ".";
                display.setText(currentInput);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
        });
    }
}