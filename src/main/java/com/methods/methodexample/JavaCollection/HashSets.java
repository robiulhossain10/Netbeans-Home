/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ROBIUL
 */
public class HashSets {
    public static void main(String[] args) {
                Set<String>flower = new HashSet<String>();
        
        flower.add("Rose");
        flower.add("Beli");
        flower.add("Mintus");
        flower.add("Shapla");
        flower.add("Joba");
        flower.add("Rose");
        
        flower.add("Joba");
        
        System.out.println("ArrayList: " + flower);
    }
}
