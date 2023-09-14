package com.lwfe.onsac;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePositionTracking implements MouseMotionListener {

    @Override
    public void mouseMoved(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        System.out.println("Mouse Position: X: " + x + ", Y: " + y);
    }

    @Override
    public void mouseDragged(MouseEvent e) {}
}
