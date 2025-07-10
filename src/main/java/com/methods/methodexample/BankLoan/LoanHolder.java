/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BankLoan;

/**
 *
 * @author ROBIUL
 */
public class LoanHolder extends Bank {

    double loanAmount, totalDebt;
    int loanID;
    String name;
    final double interestRate = 0.13;

    public LoanHolder(double loanAmount, double totalDebt, int loanID, String name) {
        this.loanAmount = loanAmount;
        this.totalDebt = totalDebt = loanAmount + loanAmount * interestRate;
        this.loanID = loanID;
        this.name = name;
        loanGiven(loanAmount);
        payableAmmount();
        interestAmount();
    }

    double interestAmount() {
        System.out.println("Interest Total Amount : " + loanAmount * interestRate);
        return loanAmount * interestRate;
    }

//    void pay(double amount){
//        totalDebt -=amount;
//        System.out.println(amount+" TK Paid");
//        getTotalFund();
//        received(amount);
//        
//    }
    void payableAmmount() {

        System.out.println("Total Payable Amount is " + totalDebt);

    }

}
