/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ConsoleBanking;

/**
 *
 * @author ROBIUL
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author ROBIUL
 */     
public class BankingSystem {

    private static Map<Integer, Accounts> accountMap = new HashMap<>();
    private static final String FILE_NAME = "accounts.dat";

    public static void main(String[] args) {
        loadAccounts();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== 🏦 Mini Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Account");
            System.out.println("5. Save & Exit");
            System.out.print("👉 Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    createAccounts(sc);
                case 2 ->
                    depositMoney(sc);
                case 3 ->
                    withdrawMoney(sc);
                case 4 ->
                    showAccounts(sc);
                case 5 ->
                    saveAccounts();
                default ->
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }

    private static void createAccounts(Scanner sc) {
        System.out.println("Enter Customer ID : ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Initial Balance");
        Double balance = sc.nextDouble();

        if (accountMap.containsKey(id)) {
            System.out.println("Accounts Already Exists!");
        } else {
            accountMap.put(id, new Accounts(id, name, balance));
            System.out.println("Accounts Created Successfully");
        }
    }

    private static void depositMoney(Scanner sc) {
        System.out.println("Enter Customer ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Diposit Ammounts : ");
        Double dipositAmount = sc.nextDouble();

        Accounts acc = accountMap.get(id);

        if (acc != null) {
            acc.diposit(dipositAmount);
        } else {
            System.out.println("Accounts Not Found");
        }
    }

    private static void withdrawMoney(Scanner sc) {
        System.out.println("Enter Customer ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Withdraw Amounts");
        Double wamount = sc.nextDouble();

        Accounts acc = accountMap.get(id);
        if (acc != null) {
            acc.withdraw(wamount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void showAccounts(Scanner sc) {
        System.out.println("Enter Customer ID : ");
        int id = sc.nextInt();

        Accounts acc = accountMap.get(id);
        if (acc != null) {
            acc.display();
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void saveAccounts() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(accountMap);
            System.out.println("Account Saved. Goodbye!");

        } catch (IOException e) {
            System.out.println("❌ Error saving accounts: " + e.getMessage());
        }
    }

    private static void loadAccounts() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            accountMap = (Map<Integer, Accounts>) in.readObject();
            System.out.println("📂 Loaded accounts from file.");
        } catch (FileNotFoundException e) {
            System.out.println("📁 No previous data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error loading accounts: " + e.getMessage());
            e.printStackTrace(); 
        }
    }

}
