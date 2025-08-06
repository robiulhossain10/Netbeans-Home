package com.methods.methodexample.DIP_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PostgreSQLConnection implements DatabaseConnection {

    private Connection conn;
    

    @Override
    public void connect() {
        try {
            String host = ConfigReader.get("POSTGRES_HOST");
            String port = ConfigReader.get("POSTGRES_PORT");
            String db = ConfigReader.get("POSTGRES_DB");
            String user = ConfigReader.get("POSTGRES_USER");
            String pass = ConfigReader.get("POSTGRES_PASS");

            String url = "jdbc:postgresql://" + host + ":" + port + "/" + db;
            conn = DriverManager.getConnection(url, user, pass);

            System.out.println("Connected to PostgreSQL database!");
        } catch (Exception e) {
            System.out.println("PostgreSQL connection failed:");
            e.printStackTrace();
        }
    }

    public void insert(String name, int age) {
        try {
            if (conn == null || conn.isClosed()) {
                System.out.println("Not connected. Connecting first...");
                connect();
            }


            String sql = "INSERT INTO testy (name, age) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Insert failed.");
            }

            ps.close();
        } catch (Exception e) {
            System.out.println("Error while inserting data:");
        }
    }
}