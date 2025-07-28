/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

import java.util.Arrays;

/**
 *
 * @author ROBIUL
 */
public class Array2DSorting {
    public static void main(String[] args) {
        int [][] arr = {
            {6,5,4},
            {3,2,1},
            {7,2,9}
        };
        
        
//        for (int i = 0; i < arr.length; i++) {
//             Arrays.sort(arr[i]);
//        }

        //row wise bubble sort
        for (int[] is : arr) {
            for (int i = 0; i < is.length; i++) {
            for (int j = i+1; j < is.length; j++) {
                if (is[i] > is[j]) {
                    int temp = is[i];
                    is[i] = is[j];
                    is[j] = temp;
                }
            }
        }
        }
       System.out.println("Arrays Sort 2D " + Arrays.deepToString(arr));
        
    }
}
