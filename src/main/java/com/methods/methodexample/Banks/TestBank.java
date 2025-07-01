/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Banks;

/**
 *
 * @author ROBIUL
 */
public class TestBank {
    
    public static void main(String[] args) {
        BankAccounts bank1 = new BankAccounts(1232555455l, "Robiul Hossain", 70000, 2135);
        BankAccounts bank2 = new BankAccounts(1232555455l, "Kazi Joynal", 50000, 5458);
        BankAccounts bank3 = new BankAccounts(1232555455l, "Habib Khan", 500, 7854);
        BankAccounts bank4 = new BankAccounts(1232555455l, "Sabrina Aurpa", 100000, 7547);
        
        bank4.accountAccess();
        bank4.bankLoan(10000, 1);
        bank4.recharge(100);
//        bank1.loanRepayment(1000,2);

//        bank2.accountAccess();
//        bank2.accountAccess();
//        bank3.accountAccess();
//        bank4.accountAccess();
    }
}
