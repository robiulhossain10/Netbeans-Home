package com.methods.methodexample.PaymentsGatway;

import java.util.Scanner;

public class CreditCardPayments extends Payment implements PaymentMethod {

    private final String storedHashedPin;

    public CreditCardPayments(double amount, String userId) {
        super(amount);
        this.storedHashedPin = PinDB.getHashedPin(userId);

        if (this.storedHashedPin == null) {
            throw new RuntimeException("User not found or PIN not set.");
        }
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
        System.out.print("Enter your PIN: ");
        String inputPin = sc.nextLine();

        if (!verifyPin(inputPin)) {
            System.out.println("❌ Authentication Failed");
            throw new RuntimeException("Auth failed");
        }

        System.out.println("✅ Authentication Successful");
    }

    @Override
    public void completeTransaction(double amount) {
        System.out.println("✅ Charged Credit Card with amount: " + amount);
    }

    @Override
    public boolean verifyPin(String inputPin) {
        return storedHashedPin.equals(HashUtil.sha256(inputPin));
    }
}
