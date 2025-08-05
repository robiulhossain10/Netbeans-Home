package com.methods.methodexample.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBatchUpdate {
    public static void main(String[] args) {
        try {
            String sql = "INSERT INTO stbatch (name,age) VALUES(?,?)";
            Connection conn = DBConnection.getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);
            conn.setAutoCommit(false); // auto commit first off
            
            psmt.setString(1, "Robiul");
            psmt.setInt(2, 26);
            psmt.addBatch();
            
            psmt.setString(1, "Fahim");
            psmt.setInt(2, 25);
            psmt.addBatch();
            
            psmt.setString(1, "Monisha");
            psmt.setInt(2, 26);
            psmt.addBatch();
            
            psmt.setString(1, "Rakib");
            psmt.setInt(2, 26);
            psmt.addBatch();
            
            psmt.setString(1, "Sams");
            psmt.setInt(2, 25);
            psmt.addBatch();
            
            int [] result = psmt.executeBatch();
            conn.commit();
            conn.setAutoCommit(true);
            
            System.out.println("Inserted Rows: " + result.length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
