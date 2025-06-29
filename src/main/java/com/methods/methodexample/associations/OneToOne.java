/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.associations;

/**
 *
 * @author ROBIUL
 */
class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }
}

class BankAccount {
    long accountNumber;
    Customer customer; // Association

    public BankAccount(long acc, Customer cust) {
        this.accountNumber = acc;
        this.customer = cust;
    }

    public void showDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Holder: " + customer.name);
    }
}

public class OneToOne {
     public static void main(String[] args) {
        Customer c = new Customer("Robiul Hossain");
        BankAccount acc = new BankAccount(123456789L, c);
        acc.showDetails();
    }
}
