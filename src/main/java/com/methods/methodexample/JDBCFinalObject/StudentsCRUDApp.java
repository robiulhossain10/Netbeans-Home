package com.methods.methodexample.JDBCFinalObject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ROBIUL
 */
public class StudentsCRUDApp {

    public static void createStudents(Students st) {
        String sql = "INSERT INTO students (first_name,last_name,email,gender,dob,created_at,is_deleted) VALUES(?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = ConnctsDB.getConnection();
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, st.getFirst_name());
            psmt.setString(2, st.getLast_name());
            psmt.setString(3, st.getEmail());
            psmt.setString(4, st.getGender().name());
            psmt.setDate(5, Date.valueOf(st.getDob()));
            psmt.setTimestamp(6, st.getCreate_at());
            psmt.setBoolean(7, st.isIs_deleted());

            int rowsAffected = psmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("✅ Student inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                psmt.close();
            } catch (Exception e) {
            }
        }

    }

    public static Students readStudentById(long id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        try {
            Connection conn = ConnctsDB.getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);

            psmt.setLong(1, id);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                return mapToStudent(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Students mapToStudent(ResultSet rs) throws SQLException {
        return new Students(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                Gender.valueOf(rs.getString("gender")),
                rs.getDate("dob").toLocalDate(),
                rs.getTimestamp("created_at"),
                rs.getBoolean("is_deleted")
        );
    }

    public static List<Students> readAllStudents() {
        String sql = "SELECT * FROM students";
        List<Students> studentlist = new ArrayList<>();
        try {
            Connection conn = ConnctsDB.getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);

            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                studentlist.add(mapToStudent(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentlist;
    }

    public static void updateDATA(Students student) {
        String sql = "UPDATE students SET first_name=?, last_name=?,email=?,gender=?,dob=?,created_at=?,is_deleted=? WHERE id =?";

        try {
            Connection conn = ConnctsDB.getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);

            psmt.setString(1, student.getFirst_name());
            psmt.setString(2, student.getLast_name());
            psmt.setString(3, student.getEmail());
            psmt.setString(4, student.getGender().name());
            psmt.setDate(5, Date.valueOf(student.getDob()));
            psmt.setTimestamp(6, student.getCreate_at());
            psmt.setBoolean(7, student.isIs_deleted());
            psmt.setLong(8, student.getId());

            psmt.executeUpdate();
            System.out.println("Update Data Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(long id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = ConnctsDB.getConnection(); PreparedStatement psmt = conn.prepareStatement(sql)) {

            psmt.setLong(1, id);
            psmt.executeUpdate();
            System.out.println("Delete Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Students std = new Students("Robiul", "Hossain", "robiul@gmail.com", Gender.MALE, LocalDate.of(2025, 6, 2), new Timestamp(System.currentTimeMillis()), true);
//        StudentsCRUDApp.createStudents(std);

//             Students std2 = new Students("Fahim", "Hossain", "fahim@gmail.com", Gender.MALE, LocalDate.of(2025, 1, 2), new Timestamp(System.currentTimeMillis()), true);
//       StudentsCRUDApp.createStudents(std2);
        // Sample read all
        List<Students> all = readAllStudents();
        int i = 0;
        do {            
            System.out.println(all.get(i));
            i++;
        } while (i < all.size());

        // Sample read one
//        Students found = readStudentById(4);
//        System.out.println("Found: " + found);
        // Update Data
//        if (found != null) {
//            found.setIs_deleted(false);
//            updateDATA(found);
//        }
        // Sample delete
//        deleteStudent(2);
    }
}
