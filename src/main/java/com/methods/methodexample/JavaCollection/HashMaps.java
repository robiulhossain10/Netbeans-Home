/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.HashMap;

/**
 *
 * @author ROBIUL
 */
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer>student = new HashMap<String,Integer>();
        
        student.put("Robiul", 10000);
        student.put("Anika", 20000);
        student.put("Rimi", 50000);
        
        System.out.println("HashMAp: " +student);
        System.out.println("HashMAp: " +student.keySet());
    }
}
