/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

/**
 *
 * @author ROBIUL
 */
public class TryHandle {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            
            int x = a/b;
            System.out.println("math: " + x);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("The Code Run Successfully");
        }
    }
}
