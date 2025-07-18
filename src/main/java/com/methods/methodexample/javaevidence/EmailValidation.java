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
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter email");
        String email = sc.nextLine();
        
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email login Success");
        } else System.out.println("Email Login Failed");
    }
}
