/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.Composition;

/**
 *
 * @author ROBIUL
 */
public class Car {
   private Engine engine;
    
   public Car(){
       engine = new Engine();
   }
   
   public void startCar(){
       engine.start();
       System.out.println("Car is Running");
   }
    
}
