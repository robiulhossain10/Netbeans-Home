/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Generics;

/**
 *
 * @author ROBIUL
 */
public class GenArray {

    public static <T> void printArray(T[] array) {
        int i = 0;

        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        String[] names = {"Robiul", "Fahim", "Karim"};
        Integer[] numbers = {1, 5, 8, 4};

        printArray(names);
        printArray(numbers);

    }

}
