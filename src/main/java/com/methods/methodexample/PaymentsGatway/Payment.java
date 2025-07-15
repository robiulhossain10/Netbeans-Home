/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.PaymentsGatway;

import java.util.UUID;

/**
 *
 * @author ROBIUL
 */
public abstract class Payment {
    String transactionId;
    double amount;

    public Payment(double amount) {
        this.transactionId = generateTransactionId();
        this.amount = amount;
    }
    
    public String generateTransactionId(){
        return "TRX" + UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }
    
    public abstract void processingPayment();
    
}
