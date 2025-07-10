/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BankLoan;

/**
 *
 * @author ROBIUL
 */
public class Bank {

    private static double totalFund = 500000;

    public static void getTotalFund() {
        System.out.println("Total Fund: " + totalFund);
    }

    void received(double amount) {
        totalFund -= amount;
    }

    void loanGiven(double amount) {
        totalFund -= amount;
    }

    void pay(double amount) {
        totalFund += amount;
        System.out.println(amount + " TK Paid");
        getTotalFund();
        received(amount);

    }
}
