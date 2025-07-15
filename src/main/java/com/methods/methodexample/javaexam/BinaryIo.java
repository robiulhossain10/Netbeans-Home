/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.javaexam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ROBIUL
 */
public class BinaryIo {
    public static void main(String[] args) {
        // Binary write
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new.bin"))) {
            oos.writeInt(1400);
            oos.writeBoolean(true);
            oos.writeUTF("Hello Bangladesh");
            System.out.println("✅ Binary Data Written");
        } catch (IOException e) {
            e.printStackTrace();
        }

        binaryRead(); 

 
}
    
   static void binaryRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("new.bin"))) {
            int number = ois.readInt();
            boolean flag = ois.readBoolean();
            String message = ois.readUTF();

            System.out.println("📘 Number: " + number);
            System.out.println("📘 Boolean: " + flag);
            System.out.println("📘 Message: " + message);
        } catch (EOFException e) {
            System.out.println("❌ End of file reached unexpectedly.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}
