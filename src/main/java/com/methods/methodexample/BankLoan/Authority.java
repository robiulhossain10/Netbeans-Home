/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BankLoan;

/**
 *
 * @author ROBIUL
 */
public class Authority {
    public static void main(String[] args) {
        LoanHolder p1 = new LoanHolder(10000, 3254,2555, "Robiul Hossain");
        
        
         Bank.getTotalFund();
        
//         p1.interestAmount();
//         p1.payableAmmount();
          p1.pay(3000);
    }
}
