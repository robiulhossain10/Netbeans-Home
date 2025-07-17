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
public class ConditionalSum {
    public static void main(String[] args) {
        int sum = 0;
        int inp;
        
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {  
            System.out.println("Enter Value");
            inp = sc.nextInt();
            
            if (inp == -1) {
                break;
            }
            sum += inp;
        }
        
        System.out.println("Results : " + sum);
        
    }
}
