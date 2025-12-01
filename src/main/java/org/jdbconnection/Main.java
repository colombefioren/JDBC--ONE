package org.jdbconnection;

import org.jdbconnection.configuration.DataSource;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT 'Coco is the best'";
        try(Connection con = new DataSource().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            System.out.println(rs.getString(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}