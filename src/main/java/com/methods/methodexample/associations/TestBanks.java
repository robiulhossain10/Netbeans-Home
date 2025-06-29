/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.associations;

/**
 *
 * @author ROBIUL
 */
public class TestBanks {
    public static void main(String[] args) {
        Customers cust = new Customers("Robiul Hossain", "2853986533", "01833821147");
        Bank bnk1 = new Bank(5454654445284l, 250000, cust);
        
        bnk1.showDetails();
    }
}
