package com.methods.methodexample.JDBC;

import java.sql.*;
import java.time.LocalDate;

public class EmployeeRepository {

    // 🔹 CREATE
    public void createEmployee(int id, String name, double salary, LocalDate hireDate, String address) {
        String pgsql = "INSERT INTO emp (id, ename, salary, hire_date, address) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(pgsql)) {

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setDouble(3, salary);
            stmt.setDate(4, Date.valueOf(hireDate));
            stmt.setString(5, address);

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? " Employee inserted" : " Insert failed");

        } catch (SQLException e) {
            System.out.println(" Error during insertion");
            e.printStackTrace();
        }
    }

    // 🔹 READ
    public void readAllEmployees() {
        String sql = "SELECT * FROM emp";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n? Employee List:");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Salary: %.2f | Hire Date: %s | Address: %s\n",
                        rs.getInt("id"),
                        rs.getString("ename"),
                        rs.getDouble("salary"),
                        rs.getDate("hire_date").toString(),
                        rs.getString("address"));
            }

        } catch (SQLException e) {
            System.out.println(" Error during fetch");
            e.printStackTrace();
        }
    }

    // 🔹 UPDATE
    public void updateEmployee(int id, String newName, double newSalary, LocalDate newHireDate, String newAddress) {
        String sql = "UPDATE emp SET ename = ?, salary = ?, hire_date = ?, address = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newName);
            stmt.setDouble(2, newSalary);
            stmt.setDate(3, Date.valueOf(newHireDate));
            stmt.setString(4, newAddress);
            stmt.setInt(5, id);

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? " Employee updated" : " Update failed");

        } catch (SQLException e) {
            System.out.println(" Error during update");
            e.printStackTrace();
        }
    }

    // 🔹 DELETE
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM emp WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? " Employee deleted" : " Delete failed");

        } catch (SQLException e) {
            System.out.println(" Error during delete");
            e.printStackTrace();
        }
    }
}
