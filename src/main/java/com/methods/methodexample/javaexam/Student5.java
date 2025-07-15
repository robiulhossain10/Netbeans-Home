/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

/**
 *
 * @author ROBIUL
 */
public class Student5 extends Pakna implements Human{
    int id;
    String name;

    public Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void dataStudent() {
        System.out.println("New Student");
    }

    @Override
    public void teacherData() {
     System.out.println("New Teacher");
    }
    
    
}
