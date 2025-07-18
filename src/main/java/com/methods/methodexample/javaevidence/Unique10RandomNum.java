/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ROBIUL
 */
public class Unique10RandomNum {
    public static void main(String[] args) {
       Set<Integer> hset = new HashSet<>();
       
       Random rand = new Random();
       
        while (hset.size() < 10) {            
            int num = rand.nextInt(100);
            hset.add(num);
        }

        
        System.out.println("Unique 10 Random Numbers: " + hset);
    }
}
