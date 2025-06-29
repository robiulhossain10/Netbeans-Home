/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Aggregations;

import java.util.List;

/**
 *
 * @author ROBIUL
 */
public class School {
    private String schoolName;
    private List<Teacher> teachers;

    public School(String schoolName, List<Teacher> teachers) {
        this.schoolName = schoolName;
        this.teachers = teachers;
    }
    
    public void showTeachers() {
        System.out.println("School: " + schoolName);
        for(Teacher t : teachers){
            System.out.println("Teacher: " + t.getName());
        }
    }
}
