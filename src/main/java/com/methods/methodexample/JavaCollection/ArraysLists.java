/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.JavaCollection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ROBIUL
 */
public class ArraysLists {
    public static void main(String[] args) {
//        ArrayList<String>flower = new ArrayList<>();
//        
//        flower.add("Rose");
//        flower.add("Beli");
//        flower.add("Mintus");
//        flower.add("Shapla");
//        flower.add("Joba");
//        
//        System.out.println("ArrayList: " + flower);
        
        Set<String>flower = new HashSet<String>();
        
        flower.add("Rose");
        flower.add("Beli");
        flower.add("Mintus");
        flower.add("Shapla");
        flower.add("Joba");
        flower.add("Rose");
        
        System.out.println("ArrayList: " + flower);
        
        Set<Integer>num = new TreeSet<Integer>();
        
        num.add(50);
        num.add(58);
        num.add(78);
        num.add(44);
        num.add(22);
        
        System.out.println("TreeSet: " + num);
        
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.peek(); // 10 collect 1st value always
        pq.poll(); // then remove
        pq.peek(); // collect 2nd value 
        
        System.out.println("PriorityQueue: " + pq);
        
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
