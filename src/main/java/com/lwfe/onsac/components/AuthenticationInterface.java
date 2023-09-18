package com.lwfe.onsac.components;

import com.lwfe.onsac.OnsacSoftware;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class AuthenticationInterface extends JFrame {

    public AuthenticationInterface() {
        initComponent();
    }

    private void initComponent() {
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        this.setTitle("Onsac v1.1");
        this.setLayout(new BorderLayout());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        this.initInsideComponents();

        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        if (filepath != null) {
            ImageIcon icon = new ImageIcon(filepath);
            this.setIconImage(icon.getImage());
            System.out.println("Icon loaded successfully 👍");
        } else {
            System.out.println("Icon not found 😔");
        }
    }

    private void initInsideComponents() {
        OnsacSoftware onsacSoftware = new OnsacSoftware();
        onsacSoftware.initInsideComponents(this);
    }

    public void setNoButton(JButton noButton) {
        noButton.addMouseListener(new MouseHoverListener(noButton));
    }
}