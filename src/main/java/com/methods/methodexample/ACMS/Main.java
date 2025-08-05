package com.methods.methodexample.ACMS;

public class Main {

    public static void main(String[] args) {
        TechnicalStaff tech = new TechnicalStaff(1, "Rahim", "2023-01-10", "Web Design", true);
        AdminStaff admin = new AdminStaff(2, "Karim", "2022-03-15", "MBA");

        // EmployeeDAO 
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(tech);
        employeeDAO.saveEmployee(admin);

        //  Campaign 
        Campaign campaign = new Campaign("Summer Sale", "Online + Print", "2025-08-01", "2025-09-01", 100000);
        CampaignDAO campaignDAO = new CampaignDAO();
        campaignDAO.saveCampaign(campaign);
    }
}

