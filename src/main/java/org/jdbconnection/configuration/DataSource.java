package org.jdbconnection.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private final static int DEFAULT_PORT = 5432;
    private final String username;
    private final String password;
    private final String url;

    public DataSource(){
        username = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");
        String databaseName = System.getenv("DATABASE_NAME");
        url = "jdbc:postgresql:://localhost:" + DEFAULT_PORT + "/" + databaseName;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username,password);
    }
}
