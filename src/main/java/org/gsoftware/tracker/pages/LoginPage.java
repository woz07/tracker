package org.gsoftware.tracker.pages;

/**
 * Displays the login page to log a user in
 * Uses singleton design pattern
 */
public class LoginPage {
    private static final LoginPage INSTANCE = new LoginPage();

    private LoginPage() {}

    public static LoginPage getInstance() {
        return INSTANCE;
    }
}
