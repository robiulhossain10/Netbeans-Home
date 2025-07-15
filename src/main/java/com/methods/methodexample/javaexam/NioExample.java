/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ROBIUL
 */
public class NioExample {
    public static void main(String[] args) {
    Path fileOldPath = Paths.get("D:\\JAVA-65\\JAVA\\NIO\\img.jpg");
    Path fileNewPath = Paths.get("D:\\JAVA-65\\JAVA\\NIO\\imgnew.jpg");
    
        try {
            Files.createDirectories(fileNewPath.getParent());
            Files.copy(fileOldPath,fileNewPath,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image Copies");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
