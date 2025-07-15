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
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorials");
        int input = sc.nextInt();
         int factorial = 1;
         int i = 1;
        do{
            factorial *= i;
            i++;
        }while(i <= input);
         System.out.println(factorial);
                 
    }
}
