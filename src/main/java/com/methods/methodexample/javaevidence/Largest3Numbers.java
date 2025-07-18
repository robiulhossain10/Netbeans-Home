/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaevidence;

import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class Largest3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int a = sc.nextInt();
        System.out.println("Enter Second Value");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Value");
        int c = sc.nextInt();

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
