package com.methods.methodexample.PaymentsGatway;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class PinDB {

    private static final Dotenv dotenv = Dotenv.load();

    private static final String DB_URL = dotenv.get("DB2_URL");
    private static final String DB_USER = dotenv.get("DB2_USERNAME");
    private static final String DB_PASS = dotenv.get("DB2_PASSWORD");

    public static void saveHashedPin(String userId, String plainPin) {
        String hashedPin = HashUtil.sha256(plainPin);
        String sql = "INSERT INTO users (user_id, hashed_pin) VALUES (?, ?) ON DUPLICATE KEY UPDATE hashed_pin = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, userId);
            stmt.setString(2, hashedPin);
            stmt.setString(3, hashedPin);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getHashedPin(String userId) {
        String sql = "SELECT hashed_pin FROM users WHERE user_id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("hashed_pin");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
