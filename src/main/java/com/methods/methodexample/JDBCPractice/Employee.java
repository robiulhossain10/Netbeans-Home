/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JDBCPractice;

import java.time.LocalDate;

/**
 *
 * @author ROBIUL
 */
public class Employee {
    private int id;
    private String name;
    private String designation;
    private LocalDate dob;
    private boolean is_deleted;

    public Employee(String name, String designation, LocalDate dob, boolean is_deleted) {
        this.name = name;
        this.designation = designation;
        this.dob = dob;
        this.is_deleted = is_deleted;
    }

    public Employee(int id, String name, String designation, LocalDate dob, boolean is_deleted) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dob = dob;
        this.is_deleted = is_deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", designation=").append(designation);
        sb.append(", dob=").append(dob);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append('}');
        return sb.toString();
    }
    
    
}
