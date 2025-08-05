/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CampaignDAO {
    public void saveCampaign(Campaign campaign) {
        String sql = "INSERT INTO campaigns (title, requirements, start_date, end_date, budget, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, campaign.getTitle());
            stmt.setString(2, campaign.getRequirements());
            stmt.setString(3, campaign.getStartDate());
            stmt.setString(4, campaign.getEndDate());
            stmt.setDouble(5, campaign.getBudget());
            stmt.setString(6, campaign.getStatus());

            stmt.executeUpdate();
            System.out.println("✅ Campaign saved to database.");
        } catch (SQLException e) {
            System.err.println("❌ Error saving campaign: " + e.getMessage());
        }
    }
}

