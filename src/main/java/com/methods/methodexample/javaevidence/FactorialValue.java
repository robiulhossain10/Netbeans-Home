/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class FactorialValue {
    public static void main(String[] args) {
        int val = 5;
        
        int factorial = 1;
        
        for (int i = 1; i <= val; i++) {
            factorial *= i;
        }
        System.out.println("factorials: " + factorial);
    }
}
