/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Loop;

/**
 *
 * @author ROBIUL
 */
public class ForEachLoop {
    public static void main(String[] args) {
   int [][] arr ={
                  {12,13,14,44},
                  {1,2,3,4,5},
                  {5,4,8,7,4}
                  };  
                  forEach(arr);
   }  
    
    static void forEach(int [] [] array){
        int total=0;  
   int max = 0;
        for (int[] is : array) {
            for (int i : is) {
                total += i;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max += array[i][j];
            }
        }
        System.out.println("Total: " + total);
        System.out.println("ForLoop: " + max);
    }
 }    
