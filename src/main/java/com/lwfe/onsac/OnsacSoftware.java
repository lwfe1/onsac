package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class OnsacSoftware {

    public void createAndLaunchOnsac() {
        final JFrame frame = new JFrame("OnsacSoftware");
        final Buttons buttons = new Buttons();
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                super.windowClosing(event);
                System.exit(0);
            }
        });

        frame.setContentPane(buttons);
        frame.pack();
        frame.setSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        if (filepath != null) {

            ImageIcon icon = new ImageIcon(filepath);
            frame.setIconImage(icon.getImage());
            System.out.println("Icon loaded successfully");

        } else {
            System.out.println("Icon not found");
        }
    }

    public static void main(String[] argument) {
        EventQueue.invokeLater(() -> new OnsacSoftware().createAndLaunchOnsac());
    }
}