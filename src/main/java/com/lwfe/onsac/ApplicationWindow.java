package com.lwfe.onsac;

import com.lwfe.onsac.listener.MousePositionTracking;

import javax.swing.*;

public class ApplicationWindow extends JPanel {

    MousePositionTracking tracking = new MousePositionTracking();

    public JButton yesButton;
    public JButton noButton;

    public ApplicationWindow() {
        this.setLayout(null);
        this.buttonConfiguration();
        this.add(yesButton);
        this.add(noButton);
        this.addMouseMotionListener(tracking);
    }

    public void buttonConfiguration() {
        yesButton = new JButton();
        yesButton.setText("Yes");
        yesButton.setBounds(500, 50, 100, 50);
        yesButton.setFocusable(false);

        noButton = new JButton();
        noButton.setText("No");
        noButton.setBounds(500, 400, 100, 50);
        noButton.setFocusable(false);
    }
}