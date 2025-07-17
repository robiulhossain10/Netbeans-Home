/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class Array2DSum {
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3},
            {7,8,9},
            {4,5,6}
        };
        
        int sum = 0;
        
        for (int[] is : arr) {
            for (int i : is) {
                sum += i;
            }
        }
        System.out.println("2D Array Results: " + sum);
    }
}
