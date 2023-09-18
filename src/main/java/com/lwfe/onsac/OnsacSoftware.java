package com.lwfe.onsac;

import com.lwfe.onsac.components.AuthenticationInterface;

import javax.swing.*;
import java.awt.*;

public class OnsacSoftware {

    public void initInsideComponents(AuthenticationInterface auth) {
        final JPanel questionPosition = new JPanel(new FlowLayout(FlowLayout.CENTER));
        final JPanel buttonPosition = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel question = new JLabel();
        question.setFont(new Font("Arial", Font.BOLD, 28));
        question.setText("Are you gay?");

        questionPosition.add(question);
        auth.add(questionPosition, BorderLayout.NORTH);

        JButton yes = new JButton();
        yes.setText("Yes");
        yes.addActionListener(
            e -> JOptionPane.showMessageDialog(null, "Caught on 4k 📷"
        ));
        yes.setFocusable(false);

        JButton noButton = new JButton();
        noButton.setText("No");
        noButton.setFocusable(false);

        buttonPosition.add(yes);
        buttonPosition.add(noButton);
        buttonPosition.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        auth.add(buttonPosition, BorderLayout.CENTER);
        auth.setNoButton(noButton);
    }
}
