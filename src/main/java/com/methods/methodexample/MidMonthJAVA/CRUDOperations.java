package com.methods.methodexample.MidMonthJAVA;

import java.sql.*;
import java.time.LocalDate;
import java.util.Properties;

public class CRUDOperations {

    public CRUDOperations(Properties props) {
    }

    private static final Properties dbprops = new Properties();
    
    static {
        String url = dbprops.getProperty("db.url");
        String user = dbprops.getProperty("db.user");
        String pass = dbprops.getProperty("db.pass");
    }

    private static Connection getConnection() throws SQLException {
        String url = dbprops.getProperty("db.url");
        String user = dbprops.getProperty("db.user");
        String pass = dbprops.getProperty("db.pass");

        return DriverManager.getConnection(url, user, pass);
    }

    public static void insertData(Employee emp) {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO employees (employee_name, designation, salary, joining_date) VALUES (?, ?, ?, ?)";
            try (PreparedStatement psmt = conn.prepareStatement(sql)) {
                psmt.setString(1, emp.getEmployee_name());
                psmt.setString(2, emp.getDesignation());
                psmt.setDouble(3, emp.getSalary());
                psmt.setDate(4, Date.valueOf(emp.getJoining_date()));

                int rowsInsert = psmt.executeUpdate();
                System.out.println(rowsInsert > 0 ? "✅ Employee inserted!" : "❌ Insert failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
