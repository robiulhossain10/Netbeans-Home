/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TextIo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class TextIOO {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Your Name");
         String name = input.nextLine();
         System.out.println("Enter Your Age");
         int Age = input.nextInt();
         
         //------------Output to file---------------
         
         try {
             FileWriter writer = new FileWriter("C:\\Users\\ROBIUL\\Desktop\\mydata.txt");
             writer.write("User Status\n");
             writer.write("Name: " + name);
             writer.write("\nAge: " + Age);
             writer.close();
             System.out.println("Data has been written");
        } catch (IOException e) {
             System.out.println("Written to file successfully");
        }
    }
    
}
