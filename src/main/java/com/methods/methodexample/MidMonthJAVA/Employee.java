/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.MidMonthJAVA;

import java.time.LocalDate;

/**
 *
 * @author ROBIUL
 */
public class Employee {
    private int employee_id;
    private String employee_name;
    private String designation;
    private Double salary;
    private LocalDate joining_date;

    public Employee(int employee_id, String employee_name, String designation, Double salary, LocalDate joining_date) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.designation = designation;
        this.salary = salary;
        this.joining_date = joining_date;
    }

    public Employee(String employee_name, String designation, Double salary, LocalDate joining_date) {
        this.employee_name = employee_name;
        this.designation = designation;
        this.salary = salary;
        this.joining_date = joining_date;
    }

    public Employee() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(LocalDate joining_date) {
        this.joining_date = joining_date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("employee_id=").append(employee_id);
        sb.append(", employee_name=").append(employee_name);
        sb.append(", designation=").append(designation);
        sb.append(", salary=").append(salary);
        sb.append(", joining_date=").append(joining_date);
        sb.append('}');
        return sb.toString();
    }
    
    
}
