/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Loop;

import java.util.Arrays;

/**
 *
 * @author ROBIUL
 */
public class WhileLoop {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 1, 3, 2, 5, 8, 65, 56, 44, 97, 22};//
        int [] [] arr2 = {
            {2,3,4,5},
            {4,5,6,7},
            {9,8,7,5}
        };
        
        doWhileLoop(arr);
        doWhileLoop2(arr2);
    }
    
    static void doWhileLoop(int [] array){
    
         int i = 0;
        int sum = 0;  

        while (i < array.length) {
            sum += array[i]; 
            i++;
        }

        System.out.println("whileSum result: " + sum);
        
    }
    
     static void doWhileLoop2(int [][] array2){
         for (int[] arrs : array2) {
              for (int i = 0; i < arrs.length; i++) {
             for (int j = i+1; j < arrs.length; j++) {
                 if (arrs[i] > arrs[j]) {
                     int temp = arrs[i];
                     arrs[i] = arrs[j];
                     arrs[j] = temp;
                 }
             }
         }
         }
         System.out.println("Arrays2while: " + Arrays.deepToString(array2)); 
     }
}
