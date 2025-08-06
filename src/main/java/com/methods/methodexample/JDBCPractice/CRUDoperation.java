
package com.methods.methodexample.JDBCPractice;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ROBIUL
 */
public class CRUDoperation {

    static Connection conn = null;
    static PreparedStatement psmt = null;

    public static void createEmployee(Employee emp) {

        try {
            conn = DBConnect.getConnection();
            String sql = "INSERT INTO emps (name,designation,dob,is_deleted) VALUES(?,?,?,?)";
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, emp.getName());
            psmt.setString(2, emp.getDesignation());
            psmt.setDate(3, Date.valueOf(emp.getDob()));
            psmt.setBoolean(4, emp.isIs_deleted());

            int insertData = psmt.executeUpdate();

            if (insertData > 0) {
                System.out.println("Inserted Data");
            } else {
                System.out.println("error Insert Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readOPeration() {
        try {
            conn = DBConnect.getConnection();
            String sql = "SELECT * FROM emps ORDER BY id ASC";
            psmt = conn.prepareStatement(sql);

            ResultSet rs = psmt.executeQuery();
            
            

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String desg = rs.getString("designation");
                String date = rs.getDate("dob").toString();
                Boolean isd = rs.getBoolean("is_deleted");

                System.out.println("ID: " + id + " Name: " + name
                        + " Designation: " + desg + " Date: "
                        + date + " is_deleted: " + isd);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDATA(int id, String name, String desg, LocalDate date, Boolean is_delete) {

        try {
            conn = DBConnect.getConnection();
            String sql = "UPDATE emps SET name=?,designation=?,dob=?,is_deleted=? where id=?";
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, name);
            psmt.setString(2, desg);
            psmt.setDate(3, Date.valueOf(date));
            psmt.setBoolean(4, is_delete);
            psmt.setInt(5, id);

            int rsupdate = psmt.executeUpdate();

            if (rsupdate > 0) {
                System.out.println("Data Updated");
            } else {
                System.out.println("Error Data Updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public  static void deleteData(int id){
        try {
            conn = DBConnect.getConnection();
            String sql = "DELETE FROM emps where id=?";
            psmt = conn.prepareStatement(sql);
            
            psmt.setInt(1, id);
            
            int rsdelete = psmt.executeUpdate();
            System.out.println("Data Delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Employee emps = new Employee("Habib Hossain", "Junior Softwere Engineer", LocalDate.of(2025, 4, 2), true);
//        CRUDoperation.createEmployee(emps);

        //Update
        updateDATA(8, "Rajib", "IT Officer", LocalDate.of(2014, Month.MARCH, 5), false);
        
        //DELETE
        
//        deleteData(5);

        //Read Operations
        readOPeration();
    }
}
