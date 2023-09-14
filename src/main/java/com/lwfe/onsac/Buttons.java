package com.lwfe.onsac;

import javax.swing.*;

public class Buttons extends JPanel {

    private JButton yesButton;
    private JButton noButton;

    public Buttons() {

        yesButton = new JButton();
        yesButton.setText("Yes");
        yesButton.addActionListener(e -> System.out.println("Yes clicked"));
        yesButton.setBounds(500, 50, 100, 30);

        noButton = new JButton();
        noButton.setText("No");
        noButton.addActionListener(e -> System.out.println("No clicked"));
        noButton.setBounds(500, 400, 100, 30);

        setLayout(null);
        add(yesButton);
        add(noButton);
    }
}