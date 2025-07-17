/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.LeetCode;

import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class LoopEX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input 1st");
        int n = sc.nextInt();
        System.out.println("Enter Second");
        int m = sc.nextInt();
        
        int sum = 0;
        int input;
//        for (int i = 0; i < n; i++) {
//            sum += m;
//            
//        }
//        System.out.println("Results : " + sum);
        
        while (true) { 
            System.out.println("-1 value input");
            input =sc.nextInt();
            
            if (input == -1) {
                break;
            }
            sum += input; 
        }
        System.out.println("-1 Results: " + sum);
        
//        int i = 0;
//        while (i < n) {
//            System.out.println("While Value: " + i);
//            i++;
//        }
//
//        i = 0;
//        do {
//            System.out.println("Do While Value: " + i);
//            i++;
//        } while (i < n);

    }
}
