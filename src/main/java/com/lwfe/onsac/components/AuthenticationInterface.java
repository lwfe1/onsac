package com.lwfe.onsac.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class AuthenticationInterface extends JFrame {

    private JButton noButton;

    public AuthenticationInterface() {
        initComponent();
    }

    private void initComponent() {
        final URL filepath = getClass().getClassLoader().getResource("icon.png");

        this.setTitle("Onsac v1.0");
        this.setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.initInsideComponents();
        this.pack();
        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        noButton.addMouseListener(new MouseHoverListener(noButton));

        if (filepath != null) {

            ImageIcon icon = new ImageIcon(filepath);
            this.setIconImage(icon.getImage());
            System.out.println("Icon loaded successfully 👍");

        } else {
            System.out.println("Icon not found 😔");
        }
    }

    private void initInsideComponents() {

        JLabel question = new JLabel();
        question.setFont(new Font("Arial", Font.BOLD, 20));
        question.setText("Are you gay?");
        add(question);

        JButton yes = new JButton();
        yes.setText("Yes");

        yes.addActionListener(e ->
            JOptionPane.showMessageDialog(null, "Caught on 4k 📷"
        ));

        yes.setFocusable(false);
        add(yes);

        add(Box.createVerticalStrut(50));
        add(Box.createHorizontalStrut(25));

        noButton = new JButton();
        noButton.setText("No");
        noButton.setFocusable(false);
        add(noButton);
    }
}
