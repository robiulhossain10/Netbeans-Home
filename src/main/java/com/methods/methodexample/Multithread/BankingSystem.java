package com.methods.methodexample.Multithread;

public class BankingSystem {

    private String accountName;
    private Long accountId;
    private double balance;

    public BankingSystem(String accountName, Long accountId, double balance) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.balance = balance;
    }

    // synchronized to make it thread-safe
    public synchronized void withdraw(double amount, String threadName) {
        if (balance >= amount) {
            try {
                Thread.sleep(1000); // Simulate processing delay
                balance -= amount;
                System.out.println(threadName + " ➜ Withdrawn: " + amount + " | Remaining Balance: " + balance);
            } catch (InterruptedException e) {
                System.err.println(threadName + " ➜ Withdrawal Interrupted");
                e.printStackTrace();
            }
        } else {
            System.out.println(threadName + " ➜ Insufficient Balance. Tried to withdraw: " + amount + ", Available: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void displayInfo() {
        System.out.println("Account Name   : " + accountName);
        System.out.println("Account Number : " + accountId);
        System.out.println("Current Balance: " + balance);
        System.out.println("-------------------------------");
    }
}
