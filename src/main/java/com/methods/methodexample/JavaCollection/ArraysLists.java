/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ROBIUL
 */
public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<String>flower = new ArrayList<>();
        
        flower.add("Rose");
        flower.add("Beli");  //replacing sunflower
        flower.add("Mintus");
        flower.add("Shapla");
        flower.add("Joba");
        
        flower.remove(0);
        
        flower.set(0, "Sun Flower");
//        flower.clear();
        boolean x = flower.isEmpty();
        
        boolean v = flower.contains("Jobad");
        
        System.out.println("empty: " +x);
         System.out.println("Contains: " +v);
        
        System.out.println("ArrayList: " + flower);      
    }
}
