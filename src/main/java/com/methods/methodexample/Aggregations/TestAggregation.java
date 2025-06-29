/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Aggregations;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ROBIUL
 */
public class TestAggregation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Robiul");
        Teacher t2 = new Teacher("Fahim");
        
        List<Teacher> teacherlist = Arrays.asList(t1,t2);
        
        School scl = new School("Sunflower School", teacherlist);
        
        scl.showTeachers();
    }
}
