/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.PriorityQueue;

/**
 *
 * @author ROBIUL
 */
public class PriorityQueues {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.peek(); // 10 collect 1st value always
        pq.poll(); // then remove
        pq.peek(); // collect 2nd value 

        System.out.println("PriorityQueue: " + pq);
    }
}
