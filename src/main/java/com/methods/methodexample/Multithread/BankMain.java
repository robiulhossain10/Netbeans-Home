
package com.methods.methodexample.Multithread;

/**
 *
 * @author ROBIUL
 */
public class BankMain {
    public static void main(String[] args) {
        BankingSystem bnk = new BankingSystem("Robiul", 215255454L, 10000.00);
        BankingSystem bnk2 = new BankingSystem("Fahim", 215245454L, 20000.00);
        BankingSystem bnk3 = new BankingSystem("Monisha", 215222454L, 30000.00);

        Thread t1 = new Thread(new ThreadBank(bnk, 1000, "thread-1"));
        Thread t2 = new Thread(new ThreadBank(bnk2, 2000, "thread-2"));
        Thread t3 = new Thread(new ThreadBank(bnk2, 5000, "thread-3"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display account info after threads finish
        System.out.println();
        bnk.displayInfo();
        bnk2.displayInfo();
        bnk3.displayInfo();
    }
}

