/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public abstract class Advertisement {
    protected String title;
    protected String targetDate;
    protected double estimatedCost;
    protected double actualCost;

    public Advertisement(String title, String targetDate, double estimatedCost, double actualCost) {
        this.title = title;
        this.targetDate = targetDate;
        this.estimatedCost = estimatedCost;
        this.actualCost = actualCost;
    }

    public abstract void showAdDetails();
}

