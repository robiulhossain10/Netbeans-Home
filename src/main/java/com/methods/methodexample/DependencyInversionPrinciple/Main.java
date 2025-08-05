/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.DependencyInversionPrinciple;

import java.util.Properties;

/**
 *
 * @author ROBIUL
 */

// Main.java
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties dbProps = DBConfig.load();
        UserRepository repo = new MySQLUserRepository(dbProps); // Should work
        UserService service = new UserService(repo);
        service.registerUser("Kafi");


//    service.updateUser(1, "Rakib");

//service.deleteUser(1);
        
        service.userDataRead();
    }
}


