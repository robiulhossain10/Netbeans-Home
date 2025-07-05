/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Recursion;

/**
 *
 * @author ROBIUL
 */
public class RecursionProblem1 {
    public static void main(String[] args) {
      int res =  recursive(5);
        System.out.println("Num: " + res);
    }
    
    static int recursive(int num){
        if(num == 0){
          return 1;
        }
          
        return num * recursive(num - 1);
        
    }
}
