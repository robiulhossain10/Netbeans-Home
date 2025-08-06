
package com.methods.methodexample.JDBCPractice;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ROBIUL
 */
public class DBConnect {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("DB3_URL");
    private static final String DB_USER = dotenv.get("DB3_USERNAME");
    private static final String DB_PASS = dotenv.get("DB3_PASSWORD");
    
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
                System.out.println("Connect To Database");
                
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
           
        }
         return connection;
    }
}
