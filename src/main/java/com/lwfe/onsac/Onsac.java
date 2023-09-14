package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class Onsac {

    public void launch() {
        final OnsacSoftware software = new OnsacSoftware();
        final JFrame frame = new JFrame("Onsac");
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                super.windowClosing(event);
                System.exit(0);
            }
        });

        frame.add(software);
        frame.pack();
        software.setPreferredSize(new Dimension(800, 600));
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
        EventQueue.invokeLater(() -> new Onsac().launch());
    }
}
