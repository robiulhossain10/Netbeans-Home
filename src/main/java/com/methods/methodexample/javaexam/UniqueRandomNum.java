/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ROBIUL
 */
public class UniqueRandomNum {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        
        Random rand = new Random();
        
        while (numbers.size() < 10) {            
            int num = rand.nextInt(100);
            numbers.add(num);
        }
        System.out.println("10 Unique Random Numbers:" + numbers);
    }
}
