/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ArraysEX;

import java.util.Arrays;

/**
 *
 * @author ROBIUL
 */
public class BubbleSortMulti {
    public static void main(String[] args) {
        int [] [] arr = {
            {6,2,1,8},
            {2,7,1,9},
            {5,7,2,1},
            {5,1,1,2}
        };
        
        normalSort(arr);
        BubbleSort(arr);
    }
    
    
    static void normalSort(int [] [] array){
        for (int[] is : array) {
            Arrays.sort(is);
        }
        System.out.println("Arrays: " + Arrays.deepToString(array));
    }
    
    static void BubbleSort(int [] [] array){
    
        for (int[] arys : array) {
            for (int i = 0; i < arys.length; i++) {
                for (int j = i+1; j < arys.length; j++) {
                    if (arys[i] > arys[i]) {
                        
                        int temp = arys[j];
                        arys[i] = arys[j];
                        arys[j] = temp;
                    }
                }
            }
           
        }
         System.out.println("BubbleSort: " + Arrays.deepToString(array));
    }
}
