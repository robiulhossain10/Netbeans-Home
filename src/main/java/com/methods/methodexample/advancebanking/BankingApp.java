package com.methods.methodexample.advancebanking;

import java.sql.*;
import java.util.Scanner;

public class BankingApp {

    private static final String url = "jdbc:mysql://mysql-av-robiulhossain0110-9408.j.aivencloud.com:24544/banking_system?sslMode=REQUIRED";
    private static final String username = "avnadmin";
    private static final String password = "AVNS_sofXB2D2Fw3rdy766LM";

    public static void main(String[] args) {
        try {
            // ✅ Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ Establish Connection
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);

            // ✅ Instantiate classes
            User user = new User(connection, scanner);
            Accounts accounts = new Accounts(connection, scanner);
            AccountManager accountManager = new AccountManager(connection, scanner);

            String email;
            long account_number;

            while (true) {
                System.out.println("\n*** WELCOME TO BANKING SYSTEM ***");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice1 = scanner.nextInt();

                switch (choice1) {
                    case 1:
                        user.register();
                        break;

                    case 2:
                        email = user.login();
                        if (email != null) {
                            System.out.println("✅ User Logged In!");

                            if (!accounts.account_exist(email)) {
                                System.out.println("1. Open a new Bank Account");
                                System.out.println("2. Exit");
                                int accChoice = scanner.nextInt();
                                if (accChoice == 1) {
                                    account_number = accounts.open_account(email);
                                    System.out.println("✅ Account Created. Account Number: " + account_number);
                                } else {
                                    break;
                                }
                            }

                            account_number = accounts.getAccount_number(email);
                            int choice2 = 0;
                            while (choice2 != 5) {
                                System.out.println("\n--- Account Menu ---");
                                System.out.println("1. Debit Money");
                                System.out.println("2. Credit Money");
                                System.out.println("3. Transfer Money");
                                System.out.println("4. Check Balance");
                                System.out.println("5. Log Out");
                                System.out.print("Enter your choice: ");
                                choice2 = scanner.nextInt();

                                switch (choice2) {
                                    case 1 ->
                                        accountManager.debit_money(account_number);
                                    case 2 ->
                                        accountManager.credit_money(account_number);
                                    case 3 ->
                                        accountManager.transfer_money(account_number);
                                    case 4 ->
                                        accountManager.getBalance(account_number);
                                    case 5 ->
                                        System.out.println("🔓 Logged Out.");
                                    default ->
                                        System.out.println("❌ Invalid Choice!");
                                }
                            }
                        } else {
                            System.out.println("❌ Incorrect Email or Password!");
                        }
                        break; // ✅ IMPORTANT!

                    case 3:
                        System.out.println("👋 THANK YOU FOR USING BANKING SYSTEM!!!");
                        return;

                    default:
                        System.out.println("❌ Enter Valid Choice");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
