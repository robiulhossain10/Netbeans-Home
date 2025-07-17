/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class ArraySum {
    public static void main(String[] args) {
        int [] arr = {5,4,7,3,6,9,8,7,4,4};
        
        int sum = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Array: " + sum);
    }
}
