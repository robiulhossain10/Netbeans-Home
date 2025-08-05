/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    public void saveEmployee(Employee emp) {
        String sql = "INSERT INTO employeedao (employeeId, name, startDate, skillOrQualification, type, availability) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, emp.employeeId);
            stmt.setString(2, emp.name);
            stmt.setString(3, emp.startDate);

            if (emp instanceof TechnicalStaff) {
                TechnicalStaff ts = (TechnicalStaff) emp;
                stmt.setString(4, ts.getSkillArea());
                stmt.setString(5, "Technical");
                stmt.setBoolean(6, ts.isAvailable());
            } else if (emp instanceof AdminStaff) {
                AdminStaff ad = (AdminStaff) emp;
                stmt.setString(4, ad.getQualification());
                stmt.setString(5, "Admin");
                stmt.setBoolean(6, false);  // AdminStaff availability নাই
            } else {
                stmt.setString(4, "");
                stmt.setString(5, "Unknown");
                stmt.setBoolean(6, false);
            }

            stmt.executeUpdate();
            System.out.println("Employee saved to database.");
        } catch (SQLException e) {
            System.err.println("Error saving employee: " + e.getMessage());
        }
    }
}

