
package com.methods.methodexample.DIP_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnection implements DatabaseConnection {
     private Connection conn;
     private PreparedStatement psmt = null;
    @Override
    public void connect() {
                try {
            String host = ConfigReader.get("MYSQL_HOST");
            String port = ConfigReader.get("MYSQL_PORT");
            String db = ConfigReader.get("MYSQL_DB");
            String user = ConfigReader.get("MYSQL_USER");
            String pass = ConfigReader.get("MYSQL_PASS");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("MySQL connection failed:");
            e.printStackTrace();
        }
    }
    
    public void insert(String name,int age){
        try {
            if (conn == null || conn.isClosed()) {
//                System.out.println("!Not Connected Connect First");
                connect();
            }
            
            String sql = "INSERT INTO diptest(name, age) VALUES(?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, name);
            psmt.setInt(2, age);
            
            int rows = psmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Rows Inserted");
            }else{
                System.out.println("Error Insert");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void read(){
        try {
             if (conn == null || conn.isClosed()) {
//                System.out.println("!Not Connected Connect First");
                connect();
            }
            
            String sql = "SELECT * FROM diptest order by id asc";
            psmt = conn.prepareStatement(sql);
            
            ResultSet rs = psmt.executeQuery();
            
            while (rs.next()) {                
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                
                System.out.println("ID     :" +id);
                System.out.println("Name   :" +name);
                System.out.println("Age    :" +age);
                System.out.println("-------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                conn.close();
                psmt.close();
                System.out.println("Close Connection!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

