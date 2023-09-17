package com.lwfe.onsac.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class AuthenticationInterface {

    private JLabel question;
    private JButton no;
    private JButton yes;

    public AuthenticationInterface() {
        initComponent();
    }

    private void initComponent() {
        final JFrame frame = new JFrame("Onsac v1.0");
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        frame.pack();
        frame.setSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        if (filepath != null) {

            ImageIcon icon = new ImageIcon(filepath);
            frame.setIconImage(icon.getImage());
            System.out.println("Icon loaded successfully 👍");

        } else {
            System.out.println("Icon not found 😔");
        }
    }
}
