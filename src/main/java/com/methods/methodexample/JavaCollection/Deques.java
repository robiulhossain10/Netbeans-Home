/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author ROBIUL
 */
public class Deques {
    public static void main(String[] args) {
                Deque<Integer>dq = new ArrayDeque<>();
        
        
        dq.add(20);
        dq.addFirst(10);
        dq.addLast(30);
        dq.offerFirst(5);
        dq.offerLast(25);
//        dq.pollFirst();
//        dq.pollLast();
        
        System.out.println("Deque: " + dq);
    }
}
