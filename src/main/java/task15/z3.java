package task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class z3 {
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, helpMenu;
    private JPopupMenu editPopupMenu;
    private JMenuItem saveMenuItem, exitMenuItem, copyMenuItem, cutMenuItem, pasteMenuItem;
    private JButton button1, button2;
    private JTextField textField;

    public z3() {
        frame = new JFrame("Программа с меню");
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Pravka");
        helpMenu = new JMenu("Spravka");
        frame.setSize(400, 200);
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        copyMenuItem = new JMenuItem("copy");
        cutMenuItem = new JMenuItem("paste");
        pasteMenuItem = new JMenuItem("Vstavit'");

        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        button1 = new JButton("Baton1");
        button2 = new JButton("Baton2");
        textField = new JTextField(20);

        frame.setJMenuBar(menuBar);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "saved");
            }
        });


        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.copy();
            }
        });

        cutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.cut();
            }
        });

        pasteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.paste();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new z3();
            }
        });
    }
}
