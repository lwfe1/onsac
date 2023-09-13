package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Onsac {

    public void launch() {
        final OnsacSoftware software = new OnsacSoftware(800, 600);
        final JFrame frame = new JFrame("Onsac");

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                super.windowClosing(event);
                System.exit(0);
            }
        });

        frame.add(software);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());

        frame.setVisible(true);
    }

    public static void main(String[] argument) {
        EventQueue.invokeLater(() -> new Onsac().launch());
    }
}
