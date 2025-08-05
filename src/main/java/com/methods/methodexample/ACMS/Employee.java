/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public abstract class Employee {
    protected int employeeId;
    protected String name;
    protected String startDate;

    public Employee(int employeeId, String name, String startDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.startDate = startDate;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getStartDate() { return startDate; }

    public abstract void showDetails();
}

