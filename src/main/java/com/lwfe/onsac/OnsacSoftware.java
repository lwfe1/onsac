package com.lwfe.onsac;

import com.lwfe.onsac.components.MousePositionTracking;

import javax.swing.*;
import java.awt.*;

public class OnsacSoftware extends JPanel {

    public MousePositionTracking tracking = new MousePositionTracking();

    public OnsacSoftware() {
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addMouseMotionListener(tracking);
    }
}
