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
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int input = sc.nextInt();
        
        if (input % 2 == 0) {
            System.out.println(input + " is even ");
        }else{
        System.out.println(input + " is odd");
        }
        
    }
}
