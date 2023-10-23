package task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class z2 {
    private JFrame frame;
    private JComboBox<String> countryComboBox;

    public z2() {
        frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());

        String[] countries = {"Australia", "England", "China", "Russia"};
        countryComboBox = new JComboBox<>(countries);



        frame.add(countryComboBox);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new z2();
            }
        });
    }
}
