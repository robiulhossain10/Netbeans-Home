package com.methods.methodexample.PaymentsGatway;

import java.util.Scanner;

public class PaymentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("\nWelcome To MyPay");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. UPI");
            System.out.println("4. LogOut");
            System.out.print("Select Payment Method: ");
            input = sc.nextInt();

            if (input == 4) {
                System.out.println("Thank you for using MyPay!");
                break;
            }

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            PaymentMethod payment;

            switch (input) {
                case 1 ->
                    payment = new CreditCardPayments(amount, "1234");
                case 2 ->
                    payment = new DebitCardPayments(amount, "4321");
                case 3 ->
                    payment = new UPIPayments(amount, "0000");
                default -> {
                    System.out.println("Invalid Payment Method");
                    continue;
                }
            }

            try {
                payment.authenticateUser(); 
                payment.completeTransaction(amount);
            } catch (RuntimeException e) {
                System.out.println("Authentication Failed. Payment Canceled.\n");
            }

        } while (true);

        sc.close();
    }
}
