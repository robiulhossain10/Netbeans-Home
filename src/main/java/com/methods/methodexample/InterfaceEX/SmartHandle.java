/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.InterfaceEX;

/**
 *
 * @author ROBIUL
 */
public class SmartHandle extends Student{

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    @Override
    public void read() {
       System.out.println("I am reading ");
    }

    @Override
    public void course() {
        System.out.println("smart teacher");
    }
    
    @Override
     public void eat(){
        System.out.println("I eating food");
    }
    
}
