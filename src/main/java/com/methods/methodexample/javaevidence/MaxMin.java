/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class MaxMin {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 50;
        
       int max =  Math.max(a, Math.max(b, c));
       int min = Math.min(a, Math.max(b, c));
       
        System.out.println("MAX " + max);
        System.out.println("MIN " + min);
        
    }
}
