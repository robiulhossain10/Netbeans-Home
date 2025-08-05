/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Campaign {
    private String title;
    private String requirements;
    private String startDate;
    private String endDate;
    private double budget;
    private String status;
    private List<Advertisement> ads;

    public Campaign(String title, String requirements, String startDate, String endDate, double budget) {
        this.title = title;
        this.requirements = requirements;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.status = "Proposed";
        this.ads = new ArrayList<>();
    }

    public void addAd(Advertisement ad) {
        ads.add(ad);
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }

    public void showCampaignInfo() {
        System.out.println("Campaign: " + title + " [" + status + "]");
        for (Advertisement ad : ads) {
            ad.showAdDetails();
        }
    }

    // ✅ Getter methods for JDBC
    public String getTitle() { return title; }
    public String getRequirements() { return requirements; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
    public double getBudget() { return budget; }
    public String getStatus() { return status; }
}


