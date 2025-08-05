/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ACMS;

/**
 *
 * @author ROBIUL
 */
public class Customer {
    private String name;
    private String companyName;
    private String address;
    private String fax;
    private String contactPerson;

    public Customer(String name, String companyName, String address, String fax, String contactPerson) {
        this.name = name;
        this.companyName = companyName;
        this.address = address;
        this.fax = fax;
        this.contactPerson = contactPerson;
    }

    public String getCompanyName() {
        return companyName;
    }
}
    
