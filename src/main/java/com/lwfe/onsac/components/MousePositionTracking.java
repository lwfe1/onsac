package com.lwfe.onsac.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePositionTracking implements MouseMotionListener {

    public int mouseX;
    public int mouseY;

    @Override
    public void mouseMoved(MouseEvent event) {
        mouseX = event.getX();
        mouseY = event.getY();
        System.out.println("Mouse Position: X: " + mouseX + ", Y: " + mouseY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {}
}
