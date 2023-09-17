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
        final JPanel questionPosition = new JPanel(new FlowLayout(FlowLayout.CENTER));
        final JPanel buttonPosition = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel question = new JLabel();
        question.setFont(new Font("Segoe UI", Font.BOLD, 36));
        question.setText("ARE YOU GAY?");

        questionPosition.add(question);
        add(questionPosition, BorderLayout.NORTH);

        JButton yes = new JButton();
        yes.setText("Yes");
        yes.addActionListener(e ->
            JOptionPane.showMessageDialog(null, "Caught on 4k 📷"
        ));
        yes.setFocusable(false);

        noButton = new JButton();
        noButton.setText("No");
        noButton.setFocusable(false);

        buttonPosition.add(yes);
        buttonPosition.add(noButton);
        buttonPosition.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        add(buttonPosition, BorderLayout.CENTER);
    }
}