package org.gsoftware.tracker.pages;

/**
 * Displays the user's job tracking status's and lets them remove/ add them too
 */
public class DashboardPage {
    private static final DashboardPage INSTANCE = new DashboardPage();

    private DashboardPage() {}

    public static DashboardPage getInstance() {
        return INSTANCE;
    }
}
