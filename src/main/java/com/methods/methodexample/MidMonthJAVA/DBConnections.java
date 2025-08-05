/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.MidMonthJAVA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author ROBIUL
 */
public class DBConnections {
    private static final String FILE = "db.properties";
    
    private static Properties load(){
        Properties props = new Properties();
        
        try {
            FileInputStream fis = new FileInputStream(FILE);
            props.load(fis);
        } catch (IOException e) {
            System.err.println("Error loading DB config: " + e.getMessage());
        }
        return props;
    }
}
