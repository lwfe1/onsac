package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;

public class ApplicationWindow extends JPanel {

    MousePositionTracking tracking = new MousePositionTracking();

    public JLabel text;
    public JButton yesButton;
    public JButton noButton;

    public ApplicationWindow() {
        this.setLayout(null);
        this.buttonConfiguration();
        this.add(text);
        this.add(yesButton);
        this.add(noButton);
        this.addMouseMotionListener(tracking);
    }

    public void buttonConfiguration() {

        text = new JLabel();
        text.setText("Are you gay?");
        text.setFont(new Font("Arial", Font.BOLD, 28));
        text.setBounds(320, 10, 250, 50);
        text.setForeground(Color.WHITE);

        yesButton = new JButton();
        yesButton.setText("Yes");
        yesButton.setBounds(270, 150, 100, 50);
        yesButton.setFocusable(false);

        noButton = new JButton();
        noButton.setText("No");
        noButton.setBounds(450, 150, 100, 50);
        noButton.setFocusable(false);
    }
}