package org.gsoftware.tracker;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import io.github.cdimascio.dotenv.Dotenv;

import javax.swing.*;
import java.awt.*;

/**
 * Entry point of program, holds GUI and logic together.
 */
public class Application {
    private final static Dotenv dotenv = Dotenv.configure().load();
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
        // TODO: Research flatlaf to find way to remove menu from being in window title bar
        // TODO: Find out how to use sessions to store user sessions so user doesn't need to login everytime they open app

        this.window.add(container);
        this.window.pack();
        this.window.setLocationRelativeTo(null);
        this.window.setResizable(false);
        this.window.setVisible(true);
    }

    public static void main(String[] args) {
        if (dotenv.get("MODE").equals("light")) {
            FlatMacLightLaf.setup();
        } else {
            FlatMacDarkLaf.setup();
        }

        SwingUtilities.invokeLater(Application::new);
    }
}
