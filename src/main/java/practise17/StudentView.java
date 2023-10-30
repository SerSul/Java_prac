package practise17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentView {
    private final JTextField rollNoField;
    private final JTextField nameField;
    private final JButton updateButton;
    private final JTextField currentDataField;

    public StudentView() {
        JFrame frame = new JFrame("Student information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        frame.add(panel);

        JLabel rollNoLabel = new JLabel("Roll No:");
        rollNoField = new JTextField(10);
        panel.add(rollNoLabel);
        panel.add(rollNoField);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel additionalLabel = new JLabel("Additional Info:");
        currentDataField = new JTextField(10);
        panel.add(additionalLabel);
        panel.add(currentDataField);

        updateButton = new JButton("Update");
        panel.add(updateButton);

        frame.setVisible(true);
    }

    public void settRollNo(String rollNo) {
        rollNoField.setText(rollNo);
    }

    public String getRollNo() {
        return rollNoField.getText();
    }

    public String getName() {
        return nameField.getText();
    }

    public void setName(String name) {
        nameField.setText(name);
    }

    public void setAdditionalInfo(String info) {
        currentDataField.setText(info);
    }

    public void addUpdateListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
}
