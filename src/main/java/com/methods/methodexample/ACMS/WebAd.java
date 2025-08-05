/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public class WebAd extends Advertisement {
    private String website;
    private String startDate;
    private String endDate;

    public WebAd(String title, String targetDate, double estimatedCost, double actualCost,
                 String website, String startDate, String endDate) {
        super(title, targetDate, estimatedCost, actualCost);
        this.website = website;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void showAdDetails() {
        System.out.println("Web Ad: " + title + " on " + website);
    }
}


