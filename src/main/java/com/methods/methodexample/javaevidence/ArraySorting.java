/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ROBIUL
 */
public class ArraySorting {
    public static void main(String[] args) {
        Integer [] arr = {5,1,2,45,7,8,5,45,9,6,4};
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i : arr) {
            System.out.println("Arrays: " + Arrays.toString(arr));
        }
    }
}
