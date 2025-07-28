package com.methods.methodexample.LeetCode;

public class Prob1 {

    public static void calculate(int a, int b) {
        if (a < b) {
            a += 2;
            System.out.println("a" + a);
        } else {
            b += 2;
            System.out.println("b: " + b);
        }

        int val = a-b;
        System.out.println(val);
    }

    public static void main(String[] args) {
        calculate(5, 7);
    }
}
