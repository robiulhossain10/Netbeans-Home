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
public class EncapsuleMain {
    public static void main(String[] args) {
        Encapsule en1 = new Encapsule();
        
        en1.setId(1);
        en1.setName("Robiul");
        en1.setAddress("Dhaka");
        en1.setDepartments("management");
        en1.setAge(22);
        en1.setDob(LocalDate.now());
        en1.accesData();
    }
}
