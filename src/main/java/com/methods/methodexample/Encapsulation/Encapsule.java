/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Encapsulation;

import java.time.LocalDate;

/**
 *
 * @author ROBIUL
 */
public class Encapsule {
    private int id;
    private String name;
    private String address;
    private String departments;
    private int age;
    private LocalDate dob;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    
    public void accesData(){
        System.out.println("ID: " + getId());
         System.out.println("Name: " + getName());
          System.out.println("Address: " + getAddress());
           System.out.println("Departments: " + getDepartments());
            System.out.println("Age: " + getAge());
             System.out.println("Date: " + getDob());
            
    }
}
