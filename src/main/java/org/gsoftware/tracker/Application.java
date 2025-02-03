package org.gsoftware.tracker;

import javax.swing.*;
import java.awt.*;

/**
 * Entry point of program, holds GUI and logic together.
 */
public class Application {
    private final JFrame window;
    private final JPanel container;
    private final CardLayout layout;
    public Application() {
        this.window = new JFrame();
        this.window.setTitle("Tracker");
        this.window.setPreferredSize(new Dimension(1280, 720));
        this.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.layout = new CardLayout();
        this.container = new JPanel(layout);

        // TODO: Add components down here

        this.window.add(container);
        this.window.pack();
        this.window.setLocationRelativeTo(null);
        this.window.setVisible(true);
    }
    public static void main(String[] args) {

    }
}
