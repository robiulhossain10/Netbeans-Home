/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Number");
        int chek = sc.nextInt();
        if (chek <= 0) {
            System.out.println("Number Must be Greater than 0");
            return;
        }
        System.out.println("Entrer 1st Number");
        int a = sc.nextInt();
        System.out.println("Entrer 2nd Number");
        int b = sc.nextInt();
        System.out.println("Entrer 3rd Number");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min( b,c));

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        
    }
}
