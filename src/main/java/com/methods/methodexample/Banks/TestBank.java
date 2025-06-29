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
        BankAccounts bank1 = new BankAccounts(1232555455l, "Robiul Hossain", 70000,0.05);
        BankAccounts bank2 = new BankAccounts(1232555455l, "Kazi Joynal", 50000,0.00);
        BankAccounts bank3 = new BankAccounts(1232555455l, "Habib Khan", 500,0.00);
        BankAccounts bank4 = new BankAccounts(1232555455l, "Fahim Hossain", 20000,0.00);

        
        bank1.accountAccess();
        bank1.bankLoan(10000);
        bank1.loanRepayment(1000,2);
     
//        bank2.accountAccess();
//        bank2.accountAccess();
//        bank3.accountAccess();
//        bank4.accountAccess();
    }
}
