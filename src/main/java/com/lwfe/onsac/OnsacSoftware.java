package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class OnsacSoftware {

    public void createAndLaunchOnsac() {

        final int height = 600;
        final int width = 800;

        final ApplicationWindow application = new ApplicationWindow();
        final JFrame frame = new JFrame("Onsac");
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                super.windowClosing(event);
                System.exit(0);
            }
        });

        frame.setContentPane(application);
        application.setBackground(Color.BLACK);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(new Dimension(width, height));
        frame.setLocationRelativeTo(null);
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