/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class Student11 extends Pakna100 implements Human{
    int id;
    String name;

    public Student11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void exampleMethod() {
        System.out.println("This is an example method from Human interface.");
    }
    
       public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
       
       public static void main(String[] args) {
        Student11 std = new Student11(26, "Robiul");
        
        std.display();
        std.serchthepakna();
        std.exampleMethod();
    }
}
