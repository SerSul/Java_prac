package task15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class z1 {
    private JFrame frame;
    private JTextField numField1, numField2, resultField;

    public z1() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(4, 2));

        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add them up");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            }
        });

        frame.add(new JLabel("1st Number:"));
        frame.add(numField1);
        frame.add(new JLabel("2nd Number:"));
        frame.add(numField2);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);
        frame.add(addButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new z1();
            }
        });
    }
}
