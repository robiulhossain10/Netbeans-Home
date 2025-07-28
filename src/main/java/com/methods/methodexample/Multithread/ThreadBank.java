package com.methods.methodexample.Multithread;

public class ThreadBank implements Runnable {

    private final BankingSystem account;
    private final double amount;
    private final String threadName;

    public ThreadBank(BankingSystem account, double amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        account.withdraw(amount, threadName);
    }
}
