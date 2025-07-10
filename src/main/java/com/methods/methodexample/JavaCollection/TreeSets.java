/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ROBIUL
 */
public class TreeSets {
    public static void main(String[] args) {
                Set<Integer>num = new TreeSet<Integer>();
        
        num.add(50);
        num.add(58);
        num.add(78);
        num.add(44);
        num.add(22);
        
        System.out.println("TreeSet: " + num);
    }
}
