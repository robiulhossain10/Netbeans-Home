package com.methods.methodexample.PaymentsGatway;

import java.util.Scanner;

public class PaymentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Enter your User ID: ");
        String userId = sc.nextLine();

        try {
            // 1st-time user → set PIN
            if (PinDB.getHashedPin(userId) == null) {
                System.out.print("No PIN found. Set new 4-digit PIN: ");
                String newPin = sc.nextLine();
                PinDB.saveHashedPin(userId, newPin);
                System.out.println("✅ PIN set successfully!\n");
                
            }

            do {
                System.out.println("\nWelcome To MyPay");
                System.out.println("1. Credit Card");
                System.out.println("2. Debit Card");
                System.out.println("3. UPI");
                System.out.println("4. Log Out");
                System.out.print("Select Payment Method: ");
                input = sc.nextInt();
                sc.nextLine(); // consume newline

                if (input == 4) {
                    System.out.println("Thank you for using MyPay!");
                    break;
                }

                System.out.print("Enter Payment Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine(); // consume newline

                PaymentMethod payment;

                switch (input) {
                    case 1 -> payment = new CreditCardPayments(amount, userId);
//                    case 2 -> payment = new DebitCardPayments(amount, userId);
//                    case 3 -> payment = new UPIPayments(amount, userId);
                    default -> {
                        System.out.println("❌ Invalid Payment Method");
                        continue;
                    }
                }

                payment.processingPayment();

            } while (true);

        } catch (RuntimeException e) {
            System.out.println("❌ " + e.getMessage());
        }

        sc.close();
    }
}
