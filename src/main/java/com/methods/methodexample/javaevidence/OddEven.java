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
public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int oe = sc.nextInt();

        if (oe % 2 == 0) {
            System.out.println(oe + " is a even Number");
        } else {
            System.out.println(oe + " is a odd number");
        }
    }

}
