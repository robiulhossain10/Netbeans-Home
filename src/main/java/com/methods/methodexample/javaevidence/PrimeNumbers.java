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
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int pr = sc.nextInt();
        boolean isPrime = true;

        if (pr <= 1) {
            isPrime = false;
        }else {
            for (int i = 2; i < Math.sqrt(pr); i++) {
                if (pr % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(pr + " is a prime number");
        } else {
            System.out.println(pr + " is not a prime number");
        }
    }
}
