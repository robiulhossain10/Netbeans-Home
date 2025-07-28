/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.OracleJDBC;

import java.time.LocalDate;

/**
 *
 * @author ROBIUL
 */
public class MainDB {
    public static void main(String[] args) {
        MyCollection repo = new MyCollection();
            // CREATE
          repo.createEmployee(1, "Monisha", 55000, LocalDate.of(2025, 7, 27), "Dhaka");
        // READ
            repo.readAllEmployees();

        // UPDATE
//          repo.updateEmployee(1, "Ayesha Khan.", 60000, LocalDate.of(2025, 1, 27), "Malibagh");

        // DELETE
//          repo.deleteEmployee(1);
    }
    }
