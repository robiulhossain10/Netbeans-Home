/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public class AdminStaff extends Employee {
    private String qualification;

    public AdminStaff(int employeeId, String name, String startDate, String qualification) {
        super(employeeId, name, startDate);
        this.qualification = qualification;
    }

    public String getQualification() { return qualification; }

    @Override
    public void showDetails() {
        System.out.println("Admin Staff: " + name + " - Qualification: " + qualification);
    }
}



