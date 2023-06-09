package co.edu.sena.proyecttwo.util;

import java.sql.*;

public class UseConectionPool {
    private static Connection getConnection() throws SQLException {
        return DBConnection.getConnection();
    }

    public static void main(String[] args) throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM my_app.categories")) {

            while (rs.next()) {
                System.out.print(rs.getString("category_id"));
                System.out.print(" | ");
                System.out.println(rs.getString("category_name"));
            }
        }
    }
}
