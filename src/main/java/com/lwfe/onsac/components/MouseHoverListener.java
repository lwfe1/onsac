package com.lwfe.onsac.components;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MouseHoverListener extends MouseAdapter {

    private final JButton button;

    public MouseHoverListener(JButton button) {
        this.button = button;
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        super.mouseEntered(event);
        int x, y;

        Random random = new Random();
        x = random.nextInt(700);
        y = random.nextInt(500);
        button.setLocation(x, y);
    }
}
