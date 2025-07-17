/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

/**
 *
 * @author ROBIUL
 */
public class Largest3Numbers {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int c = 10;

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("the largest number is " + largest);
    }
}
