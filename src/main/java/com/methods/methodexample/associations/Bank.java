/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.associations;

/**
 *
 * @author ROBIUL
 */
public class Bank {
    private Long AccountNumber;
    private double balance;
    private Customers customer;

    public Bank(Long AccountNumber, double balance, Customers customer) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.customer = customer;
    }
    
    public void showDetails(){
        System.out.println("Accounts Number: " + this.AccountNumber);
        System.out.println("Accounts Balance: " + this.balance);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer NID: " + customer.getNid());
        System.out.println("Customer Mobile: " + customer.getMobile());
    }
}
