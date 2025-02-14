package org.gsoftware.tracker.data;

/**
 * The DB manager, contains all the DB logic & functions
 * Uses singleton design pattern
 */
public class DatabaseManager {
    private static final DatabaseManager INSTANCE = new DatabaseManager();

    private DatabaseManager() {}

    public static DatabaseManager getInstance() {
        return INSTANCE;
    }

}
