/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinaryIO;

import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class MathCalculate {
    
     private int num;
     private int gun;
     private int biyog;
     private int vag;

    public MathCalculate(int a,int b) {
        this.num = a+b;
        this.biyog = a-b;
        this.vag = a/b;
         this.gun = gun;
    }


    public void calculateSum(int num){
         System.out.println("Sum : " + num);
     }
    
     public void calculateMinus(int minus){
         System.out.println("Minus : " + minus);
         throw new IllegalArgumentException("Not Access");
     }
    
     public void calculateMulti(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Value");
         int a = sc.nextInt();
         System.out.println("Enter a Next Value");
         int b = sc.nextInt();
         gun = a * b;
         System.out.println("Multi : " + gun);
     }
     
      public void calculateDivisions(){
          try {
              Scanner sc = new Scanner(System.in);
          System.out.println("Enter First divide value");
          int a = sc.nextInt();
          System.out.println("Enter Second divide Value");
          int b = sc.nextInt();
          vag = a/b;
         System.out.println("Divide : " + vag);
          } catch (ArithmeticException e) {
              System.out.println("Artithmatic " + e.getMessage());
          }
     }
}
