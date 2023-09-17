package com.lwfe.onsac;

import javax.swing.*;

public class Onsac {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(OnsacSoftware::createAndShowGUI);
    }

    /*
     * final URL filepath = getClass().getClassLoader().getResource("icon.png");
     *
     * if (filepath != null) {

            ImageIcon icon = new ImageIcon(filepath);
            frame.setIconImage(icon.getImage());
            System.out.println("Icon loaded successfully");

        } else {
            System.out.println("Icon not found");
     *  }
     *
     * Icon implementation code that will be used later.
     *
     */
}
