
package com.methods.methodexample.PaymentsGatway;

import java.util.Scanner;


public class DebitCardPayments extends Payment implements PaymentMethod{
    private final String hashedPin;
    
    public DebitCardPayments(double amount, String pin) {
        super(amount);
        this.hashedPin = HashUtil.sha256(pin);  
    }

    @Override
    public void processingPayment() {
        authenticateUser();
        completeTransaction(amount);
        System.out.println("Transaction completed with ID: " + transactionId);
    }

       @Override
    public void authenticateUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4-digit PIN: ");
        String inputPin = sc.nextLine();

        if (!verifyPin(inputPin)) {
            System.out.println("Authentication Failed. Transaction Cancelled.");
            throw new RuntimeException("Auth failed");
        }
        System.out.println("Authentication Successful");
    }

    @Override
    public void completeTransaction(double amount) {
        System.out.println("Charge Your Debit Card " + amount);
    }
    
     @Override
    public boolean verifyPin(String inputPin) {
        String hashedInput = HashUtil.sha256(inputPin);
        return hashedPin.equals(hashedInput);
    }
    
}
