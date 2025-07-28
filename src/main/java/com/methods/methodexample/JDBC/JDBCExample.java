package com.methods.methodexample.JDBC;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public class JDBCExample {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("DB3_URL");
    private static final String DB_USER = dotenv.get("DB3_USERNAME");
    private static final String DB_PASS = dotenv.get("DB3_PASSWORD");

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;

        try {
            // Optional but safe
            Class.forName("org.postgresql.Driver");

            // ✅ Correctly initialize the connection before using
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("✅ PostgreSQL Connected!");
            
            
            

            // ✅ SQL Query
            String selectSQL = "SELECT * FROM public.users";
            prst = conn.prepareStatement(selectSQL);
            rs = prst.executeQuery();

            System.out.println("\n📋 Users in DB:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id")
                        + ", Name: " + rs.getString("name")
                        + ", Email: " + rs.getString("email"));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ SQL error.");
            e.printStackTrace();
        } finally {
            // ✅ Clean up
            try {
                if (rs != null) rs.close();
                if (prst != null) prst.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
