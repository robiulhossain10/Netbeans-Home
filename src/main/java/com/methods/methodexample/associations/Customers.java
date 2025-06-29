/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.associations;

/**
 *
 * @author ROBIUL
 */
public class Customers {
    private String name;
    private String nid;
    private String mobile;

    public Customers(String name, String nid, String mobile) {
        this.name = name;
        this.nid = nid;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getNid() {
        return nid;
    }

    public String getMobile() {
        return mobile;
    }
    
    
    
}
