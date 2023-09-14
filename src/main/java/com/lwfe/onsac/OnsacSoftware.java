package com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;

public class OnsacSoftware extends JPanel {

    public MousePositionTracking tracking = new MousePositionTracking();

    public int width;
    public int height;

    public OnsacSoftware(int width, int height) {
        this.height = height;
        this.width = width;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addMouseMotionListener(tracking);
    }
}
