/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public class NewspaperAd extends Advertisement {
    private String newspaperName;
    private String placement;
    private String date;
    private String[] repeatDates;

    public NewspaperAd(String title, String targetDate, double estimatedCost, double actualCost,
                       String newspaperName, String placement, String date, String[] repeatDates) {
        super(title, targetDate, estimatedCost, actualCost);
        this.newspaperName = newspaperName;
        this.placement = placement;
        this.date = date;
        this.repeatDates = repeatDates;
    }

    @Override
    public void showAdDetails() {
        System.out.println("Newspaper Ad: " + title + " in " + newspaperName);
    }
}


