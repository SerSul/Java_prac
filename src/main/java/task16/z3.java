package task16;

import javax.swing.*;
import java.awt.*;

public class z3 extends JFrame {
    private final static String password = "348233083";
    private final static String login = "remsely";
    private final static String service = "Java";

    z3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(2, 5, 2, 5);

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField(20);

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;

        gbc.gridy = 0;
        panel.add(serviceLabel, gbc);
        gbc.gridy = 1;
        panel.add(loginLabel, gbc);
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;

        gbc.gridy = 0;
        panel.add(serviceField, gbc);
        gbc.gridy = 1;
        panel.add(loginField, gbc);
        gbc.gridy = 2;
        panel.add(passwordField, gbc);

        JButton button = new JButton("Log in");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;

        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(button, gbc);

        button.addActionListener(e -> {
            String login = loginField.getText();
            String service = serviceField.getText();
            String password = new String(passwordField.getPassword());

            if (checkInput(service, login, password))
                JOptionPane.showMessageDialog(this, "Вход выполнен!");
            else
                JOptionPane.showMessageDialog(this, "Неверные входные данные!");
        });
        add(panel);

        pack();
        setVisible(true);
    }

    private boolean checkInput(String service, String login, String password) {
        return service.equals(z3.service) &&
                login.equals(z3.login) &&
                password.equals(z3.password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(z3::new);
    }
}
