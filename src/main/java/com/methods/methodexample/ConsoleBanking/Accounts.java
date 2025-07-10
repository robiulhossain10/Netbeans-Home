/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ConsoleBanking;

import java.io.Serializable;

/**
 *
 * @author ROBIUL
 */
public class Accounts implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Double balance;

    public Accounts(int id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Accounts{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
    
    public boolean diposit(Double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Diposit Successful New Balance " + balance);
            return true;
        } else{
            System.out.println("Invalid Diposit Amounts");
            return false;
        }
    }
    
    public boolean withdraw(Double amount){
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("✅ Withdrawal successful. New Balance: " + balance);
            return true;
        }else{
            System.out.println("❌ Withdrawal failed. Insufficient balance or invalid amount.");
            return false;
        }
    }
    
    public void display(){
        System.out.println("Account ID: " + id);
        System.out.println("Account Name: " + name);
        System.out.println("Balance : " + balance);
    }
}
