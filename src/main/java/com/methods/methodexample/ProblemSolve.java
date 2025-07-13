/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample;

import java.util.Arrays;

/**
 *
 * @author ROBIUL
 */
public class ProblemSolve {
    public static void main(String[] args) {
        String in = "listen";
        String in2 = "silent";
        
        
        char[] ar = in.toCharArray();
        char[] ar2 = in2.toCharArray();
        
        Arrays.sort(ar);
        Arrays.sort(ar2);
        
        boolean result = Arrays.equals(ar, ar2);
        
        System.out.println("Arrays: " + ar);
        System.out.println("Arrays: " + in2);
        
        System.out.println("arrays boolean: " + result);
    }
}
