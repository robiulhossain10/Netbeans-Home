/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public class TechnicalStaff extends Employee {
    private String skillArea;
    private boolean available;

    public TechnicalStaff(int employeeId, String name, String startDate, String skillArea, boolean available) {
        super(employeeId, name, startDate);
        this.skillArea = skillArea;
        this.available = available;
    }

    public String getSkillArea() { return skillArea; }
    public boolean isAvailable() { return available; }

    @Override
    public void showDetails() {
        System.out.println("Technical Staff: " + name + " - Skill: " + skillArea);
    }
}



