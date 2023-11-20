package prac24.task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorApplication {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApplication(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        createUI();
    }

    private void createUI() {
        JFrame frame = new JFrame("Text Editor");
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createNew();
                document.open();
            }
        });

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createOpen();
                document.open();
            }
        });

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (document != null) {
                    document.save();
                }
            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorApplication editorApp = new EditorApplication(textDocumentFactory);
    }
}

