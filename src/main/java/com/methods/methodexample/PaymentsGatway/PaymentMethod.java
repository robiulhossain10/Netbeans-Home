/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.methods.methodexample.PaymentsGatway;

/**
 *
 * @author ROBIUL
 */
public interface PaymentMethod {
    void authenticateUser();
    void completeTransaction(double amount);
    boolean verifyPin(String inputPin);
    void processingPayment(); 
}
