/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author ROBIUL
 */
public class ForLoop {

    public static void main(String[] args) {
        int[] arrys = {5, 9, 8, 7, 1, 3, 2, 5, 8, 65, 56, 44, 97, 22};//332
        forILoop(arrys);
        arraySum(arrys);
    }

    public static void forILoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Arrays: " + Arrays.toString(arr));
    }

    static void arraySum(int[] arr2) {
        int sum = 0;

        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println("Sum: " + sum);
    }
}
