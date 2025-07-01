/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.TextIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ROBIUL
 */
public class ReadFile {
    public static void main(String[] args) {
        
        
        try {
            File file = new File("C:\\Users\\ROBIUL\\Desktop\\mydata.txt");
            Scanner fileScanner = new Scanner(file);
                    System.out.println("\nReading form output.txt");
                    while (fileScanner.hasNext()) {
                        System.out.println(fileScanner.nextLine());
                    }
                    fileScanner.close();
                     System.out.println("Data has been written to output.txt");
            
        } catch (FileNotFoundException e) {
             System.out.println("Error");
        }
        
    }
}
