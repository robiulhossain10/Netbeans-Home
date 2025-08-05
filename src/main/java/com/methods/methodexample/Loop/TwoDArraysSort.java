package com.methods.methodexample.Loop;

import java.util.Arrays;

public class TwoDArraysSort {
    public static void main(String[] args) {
        int [][] arr = {
            {5,6,8,7},
            {2,5,8,7},
            {9,8,5,4}
        };
        
        twoDarraysSort(arr);
    }
    
    public static void twoDarraysSort(int [] [] arrays){
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
           
        }
         System.out.println(Arrays.deepToString(arrays));

    int sum = 0;

           for (int i = 0; i < arrays.length; i++) {
               for (int j = 0; j < arrays.length; j++) {
                   sum += arrays[i][j];
               }
        }
           System.out.println(sum);
    }
}
