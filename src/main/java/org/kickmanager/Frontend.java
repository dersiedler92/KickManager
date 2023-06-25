package org.kickmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Frontend {

    private JFrame frame;
    public Frontend() {
    }

    public void createFrontend() {
        frame = new JFrame();
        frame.setTitle("Kick Manager 2023");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenu editMenu = new JMenu("Edit");
        fileMenu.setMnemonic(KeyEvent.VK_E);
        JMenu helpMenu = new JMenu("Help");
        fileMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        CardLayout cardLayout = new CardLayout();
        JPanel motherPanel = new JPanel(cardLayout);
        JPanel childPanel1 = new JPanel();
        JPanel childPanel2 = new JPanel();
        childPanel1.add(new JLabel("Hello"));
        childPanel2.add(new JLabel("Bye"));
        motherPanel.add(childPanel1, "child 1");
        motherPanel.add(childPanel2, "child 2");
        frame.add(motherPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
