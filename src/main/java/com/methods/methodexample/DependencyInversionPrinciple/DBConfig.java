/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.DependencyInversionPrinciple;

/**
 *
 * @author ROBIUL
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBConfig {
    private static final String FILE = "db.properties";

    public static Properties load() {
        Properties props = new Properties();
        try {
            
            FileInputStream fis = new FileInputStream(FILE) ;
            props.load(fis);
        } catch (IOException e) {
            System.err.println("Error loading DB config: " + e.getMessage());
        }
        return props;
    }
}
