package com.methods.methodexample.DependencyInversionPrinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLUserRepository implements UserRepository {

    private final Properties dbProps;

    public MySQLUserRepository(Properties dbProps) {
        this.dbProps = dbProps;
    }

    private Connection getConnection() throws SQLException {
        String url = dbProps.getProperty("db.url");
        String user = dbProps.getProperty("db.username");
        String pass = dbProps.getProperty("db.password");

        return DriverManager.getConnection(url, user, pass);
    }

    @Override
    public void insert(String username) {
        String sql = "INSERT INTO dip (username) VALUES (?)";

        try (Connection conn = getConnection(); 
             PreparedStatement psmt = conn.prepareStatement(sql)) {

            psmt.setString(1, username);
            psmt.executeUpdate();
            System.out.println("✅ User inserted: " + username);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        String sql = "SELECT * FROM dip";

        try (Connection conn = getConnection(); 
             PreparedStatement psmt = conn.prepareStatement(sql);
             ResultSet rs = psmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                System.out.println("ID: " + id + " Name: " + username);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, String username) {
        String sql = "UPDATE dip SET username = ? WHERE id = ?";

        try (Connection conn = getConnection(); 
             PreparedStatement psmt = conn.prepareStatement(sql)) {

            psmt.setString(1, username);
            psmt.setInt(2, id);

            int rowsUpdated = psmt.executeUpdate();
            System.out.println("✅ Rows updated: " + rowsUpdated);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM dip WHERE id = ?";

        try (Connection conn = getConnection(); 
             PreparedStatement psmt = conn.prepareStatement(sql)) {

            psmt.setInt(1, id);

            int rowsDeleted = psmt.executeUpdate();
            System.out.println("✅ Rows deleted: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
