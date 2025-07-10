/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.LinkedList;

/**
 *
 * @author ROBIUL
 */
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String>studentList = new LinkedList<String>();
        
        studentList.add("Robiul");
        studentList.add("Sakib");
        studentList.add("Habib");
        studentList.add("Karim");
        studentList.add("Samim");
        studentList.add(5, "Fahim");
        
        studentList.addFirst("Monisha");
        studentList.remove(0);
        
        System.out.println("LinkedList: " + studentList);
        System.out.println("LinkedList IDX Elements : " + studentList.get(3));
    }
}
