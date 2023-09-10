package main.java.com.lwfe.onsac;

import javax.swing.*;
import java.awt.*;

public class OnsacSoftware extends JPanel {

    public int width;
    public int height;

    public OnsacSoftware(int width, int height) {
        this.width = width;
        this.height = height;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }
}
